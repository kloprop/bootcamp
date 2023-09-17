package com.example;

import  static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class ToleranceTest {
  @Test
  void test(){
    double actual = 3.14159;
    double expected = 3.14; 

    double tolerance = 0.01; // 3.13 - 3.15
    // assertThat(3.153343,closeTo(expected, tolerance)); //false
    assertThat(3.14159,closeTo(expected, tolerance));
    assertThat(3.14999,closeTo(expected, tolerance));
    assertThat(3.13001,closeTo(expected, tolerance));
    // assertThat(3.12999,closeTo(expected, tolerance)); // false
  }
}
