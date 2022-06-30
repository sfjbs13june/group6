package com.data.calculator;

import com.data.calculator.CalculatorController;
import com.data.calculator.MyOperation;
import com.data.calculator.Operation;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorControllerTest {
  MyOperation myOperation = new MyOperation();
  Operation operation = new Operation(myOperation);
  CalculatorController calculatorController = new CalculatorController(operation);

  @Test
  public void additionSuccessTest() {
    int a = 5;
    int b = 6;
    int expectedValue = 11;
    int actualValue = calculatorController.addition(a, b);
    Assert.assertEquals(expectedValue, actualValue);
  }

  @Test
  public void additionFailureTest() {
    int a = 5;
    int b = 6;
    int expectedValue = 12;
    int actualValue = calculatorController.addition(a, b);
    Assert.assertNotEquals(expectedValue, actualValue);
  }

  @Test
  public void subtractionTest() {
    int a = 5;
    int b = 2;
    int expectedValue = 3;
    int actualValue = calculatorController.subtraction(a, b);
    Assert.assertEquals(expectedValue, actualValue);
  }

  @Test
  public void multiplicationTest() {
    int a = 5;
    int b = 2;
    int expectedValue = 10;
    int actualValue = calculatorController.multiplication(a, b);
    Assert.assertEquals(expectedValue, actualValue);
  }

  @Test
  public void divisionTest() {
    int a = 10;
    int b = 2;
    double expectedValue = 5;
    double actualValue = calculatorController.division(a, b);
    Assert.assertEquals((int)expectedValue, (int)actualValue);
  }

  @Test
  public void myOperationTest() {
    String expectedValue="MyOperation done:operation done";
    String actualValue = calculatorController.myoperation();
    Assert.assertEquals(expectedValue, actualValue);
  }

}
