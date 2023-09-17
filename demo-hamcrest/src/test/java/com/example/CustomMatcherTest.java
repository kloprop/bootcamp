package com.example;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class CustomMatcherTest {
  @Test
  void customMatcherTest(){
    String str = " HELLO WORLD";
    String str2= "Hello world";
    String str3 = "hello world";

    MatcherAssert.assertThat(str, UppercaseMatcher.containUpperCaseOnly());
    /* MatcherAssert.assertThat(str2, UppercaseMatcher.containUpperCaseOnly());
    MatcherAssert.assertThat(str3, UppercaseMatcher.containUpperCaseOnly()); */
  }
}
