package com.example;

import  static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;


public class TypeTest {
  @Test
  void testType(){ 
    Object object = "Hello world";
    assertThat(object, instanceOf(String.class));
  }

  @Test
  void testIf (){
    assertThat(Integer.class, is (typeCompatibleWith(Number.class))); // Integer under Number
    assertThat(Integer.class, is (typeCompatibleWith(Object.class)));
    assertThat(Number.class, is (typeCompatibleWith(Integer.class)));
  }
}
