package com.example;

import org.junit.jupiter.api.Test;
import  static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class ArrayTest {
  @Test
  void testArray(){
    String[] strings = new String[]{"apple", "cherry", "banana"};

    assertThat(strings, arrayContaining("apple", "cherry", "banana"));
    assertThat(strings, not (arrayContaining("apple", "banana", "cherrys")));
    assertThat(strings, arrayContainingInAnyOrder("banana", "cherry", "apple"));
    
  }
}
