package com.hkjava.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class PerClassTest {
  private int x;

  @Test
  @Order(2)
  void test1(){
    x++;
    Assertions.assertEquals(2,x);
    System.out.println(x);
  }
  @Test
  @Order(1)
  void test2(){
    x++;
    Assertions.assertEquals(1,x);
    System.out.println(x);
    
  }
}
