/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.hints;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/codeInsight/hints/lambda")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinLambdasHintsProviderGenerated extends AbstractKotlinLambdasHintsProvider {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInLambda() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/codeInsight/hints/lambda"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("AnnotatedStatement.kt")
    public void testAnnotatedStatement() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/AnnotatedStatement.kt");
    }

    @TestMetadata("DisabledHints.kt")
    public void testDisabledHints() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/DisabledHints.kt");
    }

    @TestMetadata("Elvis.kt")
    public void testElvis() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/Elvis.kt");
    }

    @TestMetadata("If.kt")
    public void testIf() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/If.kt");
    }

    @TestMetadata("ImplicitIt.kt")
    public void testImplicitIt() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/ImplicitIt.kt");
    }

    @TestMetadata("ImplicitSingleLine.kt")
    public void testImplicitSingleLine() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/ImplicitSingleLine.kt");
    }

    @TestMetadata("ImplicitThis.kt")
    public void testImplicitThis() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/ImplicitThis.kt");
    }

    @TestMetadata("Label.kt")
    public void testLabel() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/Label.kt");
    }

    @TestMetadata("LabeledStatement.kt")
    public void testLabeledStatement() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/LabeledStatement.kt");
    }

    @TestMetadata("Nested.kt")
    public void testNested() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/Nested.kt");
    }

    @TestMetadata("NoHintForSingleExpression.kt")
    public void testNoHintForSingleExpression() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/NoHintForSingleExpression.kt");
    }

    @TestMetadata("OneLineIf.kt")
    public void testOneLineIf() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/OneLineIf.kt");
    }

    @TestMetadata("PostfixPrefixExpr.kt")
    public void testPostfixPrefixExpr() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/PostfixPrefixExpr.kt");
    }

    @TestMetadata("Qualified.kt")
    public void testQualified() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/Qualified.kt");
    }

    @TestMetadata("ReturnFunType.kt")
    public void testReturnFunType() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/ReturnFunType.kt");
    }

    @TestMetadata("SimpleCase.kt")
    public void testSimpleCase() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/SimpleCase.kt");
    }

    @TestMetadata("When.kt")
    public void testWhen() throws Exception {
        runTest("idea/testData/codeInsight/hints/lambda/When.kt");
    }
}
