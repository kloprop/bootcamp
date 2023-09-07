package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness; 

@ExtendWith(MockitoExtension.class)
public class SpyTest {

  @Spy
  Calculator calculator;
  // fake object
  // has instance variables 
  // has instance methods
  // mock would override spy
  // not suitable for unit test

  @InjectMocks
  Checkout checkout;
  // every variable of checkout would have a spy calculator inside 

  // 1. Abnormal Spy and Mock usage (Spy is overriden by Mock) (Scenario: x > 1)
  @Test
  void testAdd1(){
    when(calculator.substract(3, 4)).thenReturn(100); // Covered by Mock

    int result = checkout.add(3, 4);  // involved calculator.substract
    assertEquals(104, result); // 4 + 100 = 104
    verify(calculator,times(1)).substract(3, 4);
  }


  // 2. Normal Spy usage (Scenario : x > 1)
  @Test
  void testAdd2() { // There is no 'when', Spy is used
    int result = checkout.add(3, 4);  
    assertEquals(3, result); // 4 + (4 - 3 - 2) = 3
    verify(calculator, times(1)).substract(3, 4);
  }

  // 3.SPECIAL Spy and Mock usage (1 method is covered by Mock while 1 is covered by Spy)
  @Test
  void test3(){
    when(calculator.multiply(-2, 4)).thenReturn(100); // Cover 1 method

    int result = checkout.multiply(-2, 4); // Involves two method form Calculator
    assertEquals(104, result); //  100 + (4 - (-2) -2) = 104
    verify(calculator, times(1)).multiply(-2, 4);
    verify(calculator, times(1)).substract(-2, 4);
  }




}
