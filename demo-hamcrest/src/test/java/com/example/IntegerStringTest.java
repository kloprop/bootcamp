package com.example;


import  static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import lombok.val;

public class IntegerStringTest {
  
  @Test
  public void test(){
    int value = 40;

    assertThat(value,is(equalTo(40))); 
    // MatcherAssert.assertThat
    // Matchers.is

    assertThat(value, is(greaterThan(30)));
    assertThat(value, greaterThan(30));
    assertThat(value, is(not(greaterThan(30))));
    assertThat(value, lessThan(60));
    assertThat(value, lessThanOrEqualTo(40));
    assertThat(value, greaterThanOrEqualTo(40));
  }

  @Test
  void testString(){
    String str = "Hello world";
    assertThat(str,containsString("world"));
    assertThat(str,not (containsString("world!")));

    String str2 = new String("Hello world");
    assertThat(str, equalTo(str2)); // value
    assertThat(str, is(not(sameInstance(str2)))); // object reference
    assertThat(str2, is(notNullValue()));

    assertThat(str, startsWith("Hello"));
    assertThat(str, not(startsWith("Hello")));

    String str3 = "";
    assertThat(str3, is(emptyString()));
  }

  @Test
  void testLogicalMatcher(){
    int val = 42;
    // And
    assertThat(val,allOf(greaterThan(41),
                    lessThan(43), 
                    greaterThanOrEqualTo(42)));
    // Or
    assertThat(val,anyOf(greaterThan(41),
                    lessThan(43), 
                    greaterThanOrEqualTo(42)));
  }
}
