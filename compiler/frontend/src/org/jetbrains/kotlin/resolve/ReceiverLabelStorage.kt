/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.resolve

import org.jetbrains.kotlin.descriptors.CallableDescriptor
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor
import org.jetbrains.kotlin.descriptors.ReceiverParameterDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.isExtension

class ReceiverLabelStorage(val declarationDescriptor: DeclarationDescriptor) {
    private val receiverToLabelMap: MutableMap<ReceiverParameterDescriptor, String?> = linkedMapOf()
    private val labelToReceiversMap: MutableMap<String?, MutableList<ReceiverParameterDescriptor>> = linkedMapOf()

    fun get(labelName: String?) = listOfNotNull(labelToReceiversMap[labelName]).flatten().firstOrNull()

    fun get(receiverDescriptor: ReceiverParameterDescriptor) = receiverToLabelMap[receiverDescriptor]

    fun put(labelName: String?, receiverDescriptor: ReceiverParameterDescriptor) {
        receiverToLabelMap[receiverDescriptor] = labelName
        labelToReceiversMap[labelName] = labelToReceiversMap.getOrDefault(labelName, mutableListOf()).apply {
            add(receiverDescriptor)
        }
    }

    fun findReceiver(predicate: (ReceiverParameterDescriptor) -> Boolean): ReceiverParameterDescriptor? {
        if (declarationDescriptor.isExtension) {
            (declarationDescriptor as CallableDescriptor).extensionReceiverParameter?.let {
                if (predicate(it)) return it
            }
        }
        if (declarationDescriptor is ClassDescriptor && predicate(declarationDescriptor.thisAsReceiverParameter)) {
            return declarationDescriptor.thisAsReceiverParameter
        }
        return receiverToLabelMap.keys.firstOrNull(predicate)
    }
}