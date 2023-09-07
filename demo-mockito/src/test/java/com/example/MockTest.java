package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class MockTest {

  @Mock
  // Create a fake object
  // No instance variables
  // Has instance methods, but can not execute the method
  Calculator calculator;


  @InjectMocks
  Checkout checkout;
  // Every variables of checkout would be new with a mock calculator inside



  // 1. Normal Mock usage (Scenario: x > 1)
  @Test
  void testAdd1(){
    when(calculator.substract(3, 4)).thenReturn(100);
    
    int result = checkout.add(3,4);
    assertEquals(104,result); // 4 + 100 = 104 
    verify(calculator, times(1)).substract(3, 4); 
    // Make sure that the 'when' is triggered only once
    // Make sure that the tested logic work properly
    // Make sure that the other method does not affect tested logic
    
  }

  // 2. Normal Mock usage (Scenario : x <= 1)
  @Test
  void testAdd2(){
    when(calculator.substract(1, 4)).thenReturn(100);
    
    int result = checkout.add(1,4);
    assertEquals(5,result); // 1 + 4 = 5
    // verify(calculator, times(1)).substract(1, 4); // fail test 
  }

  // 3. Create Calculator without using Mock
  // Testing substract method in calculator but not testing methods in Checkout
  @Test
  void testSubstract() {
    Calculator selfNew = new Calculator(3);
    assertEquals(-3, selfNew.substract(0, 0)); // 0 - 0 - 3 = -3
  }

  // 4. Noraml Mock usage (x > 1)
  @Test
  void testMutiply(){
    when(calculator.substract(7, 9)).thenReturn(10000);
    when(calculator.multiply(7, 9)).thenReturn(10000);
    int result = checkout.multiply(7 , 9); // 9 + 10000 = 10009
    assertEquals(10009,result);
  }

  // 5. Abnoraml Mock usage (Mock's 'when' does not cover test case)
  @Test
  void testMutiply2(){
    when(calculator.substract(3, 8)).thenReturn(10000); // 'when' only cover substract(3,8)
    int result = checkout.multiply(3, 8); // does not cover by 'when'
    assertEquals(8,result); // 8 + 0 = 8
    
    // 0 is the default value of multiply methout in Checkout (int)
    
  }

  // 6. Abnormal Mock usage (calling Mock's method) 空包彈
  @Test
  void testSubstract2() {
    assertEquals(-4, calculator.substract(10, 6));
  }
}
