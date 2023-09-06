package com.hkjava.bootcamp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BeforeAllAfterAllTest {
  private int x;
   // why must static when Lifecycle is method?

  // Excute once only before all test methods
  static void beforeAll() {
    System.out.println("beforeAll start");
    // Assertions.assertTrue(false);
    // x++;
    // System.out.println("after before all : " + this.x);

    // PER_METHOD & static
    BeforeAllAfterAllTest.beforeAll();
    BeforeAllAfterAllTest test = new BeforeAllAfterAllTest();
    test.test();
    test.test2();
    BeforeAllAfterAllTest.afterAll();

    // PER_CLASS & non static
    BeforeAllAfterAllTest test1 = new BeforeAllAfterAllTest();
    test1.beforeAll();
    test1.test();
    test1.test2();
    test1.afterAll();

    //PER_METHOD & non static
    BeforeAllAfterAllTest test3 = new BeforeAllAfterAllTest();
    test1.beforeAll();
    test1.test();
    test1.test2();
    test1.afterAll();
  }

  @AfterAll
  static void afterAll() {
    System.out.println("afterAll start");
    // x++;

    
    /* BeforeAllAfterAllTest test = new BeforeAllAfterAllTest(); 
    test.AfterAll();
    BeforeAllAfterAllTest.AfterAll(); */
  }

  @Test
  void test() {
    System.out.println("hi");
    Assertions.assertTrue(true);
  }
  @Test
  void test2() {
    System.out.println("hi");
    Assertions.assertTrue(true);
  }
}
