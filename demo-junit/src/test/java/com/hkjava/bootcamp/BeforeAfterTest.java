package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BeforeAfterTest {
  private int x;


  @BeforeEach // Total 4 objs
  // called after created obj
  void configuration() {
    System.out.println("Configuration start : " + this.x);
    // assertEquals(2, this.x);
    System.out.println("Configuring, assertequl : " +this.x);
    this.x += 3;
    System.out.println("Configuration end " + this.x);

    /* // PER_METHOD
    BeforeAfterTest test = new BeforeAfterTest();
    test.configuration();
    test.testAdd();
    test.endOfTest();
    BeforeAfterTest test1 = new BeforeAfterTest();
    test.configuration();
    test.testAdd2();
    test.endOfTest();

    // PER_CLASS
    BeforeAfterTest test3 = new BeforeAfterTest();
    test3.configuration();
    test3.testAdd();
    test3.endOfTest();
    test3.configuration();
    test3.testAdd2();
    test3.endOfTest(); */
  }

  @AfterEach
  void endOfTest() {
    System.out.println("end of Test start!" + this.x);
    this.x -= 2;
    System.out.println("end of test end : " + this.x);
  }



 @Test
  void testAdd() {
    System.out.println("before testAdd: "+ this.x);
    assertEquals(8, App.add(this.x, 5));
    System.out.println("After testAdd: " + this.x);
  } 

  @Test
  void testAdd2() {
    System.out.println("before testAdd2 " + this.x);
    assertEquals(8, App.add(this.x, 5)); // normal is 9
    System.out.println("after testAdd2 " + this.x);
  } 

}
