package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
// PER_METHOD create new obj when test
// PER_CLASS create one obj at all


@DisplayName("ABC test")
class AssertTest {
  private int x;

  @Test
  void testAssertEqual() {
    // Assertions.assertEquals(actual value, expected value);

    assertEquals(10, App.add(3, 7));
    x++;
    assertEquals(1, x);
  }

  @Test
  void testAssertNotEqual() {
    assertNotEquals(12, App.add(3, 7));
  } 

  @Test
  void testAssertTrue() {
    assertTrue(5 > 3);
    System.out.println("yy");
  }

  @Test
  void testAssertFalse() {
    assertFalse(3 > 3);
  }

  @Test
  void testAssertNull() { // check whether it is null
    String str = null;
    assertNull(str);
  }
  @Test 
  void testAssertNotNull(){
    Student student = new Student();
    assertNotNull(student.getSubjects());
  }
  @Test
  void testAssertThrows(){
    // check whether it would throw exception
    assertThrows(ArithmeticException.class, ()->{
      App.divide(10, 0);
    });
    assertDoesNotThrow(()-> {
      App.divide(5, 3);
    });
  }
  @Test
  void testAssertTimeout(){
    // check whether the method would time out
    assertTimeout(Duration.ofMillis(100), ()->{
      Thread.sleep(50);
    });
  }
  @Test
  void testCombine(){
    assertAll(() -> assertTrue(10 > 3),
              () -> assertEquals(10,App.add(4,6)))
    ;
  }

  @Test
  void testSame(){
    // check whether the address is the same
    String s1 = new String("jUnit");
    String s2 = new String("jUnit");
    assertNotSame(s1,s2);

    String s3 = "jUnit";
    String s4 = "jUnit";
    assertSame(s3, s4);

  }

}
