package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import  static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class CollectionTest {
  @Test
  void testList(){
    List<String> strings = Arrays.asList("apple", "banana", "cherry");
    assertThat(strings, hasItem("apple"));
    assertThat(strings, hasItems("apple", "cherry"));
    assertThat(strings, hasSize(3));
    assertThat(strings, contains("apple", "cherry", "banana")); // contains all and right in order
    assertThat(strings, not(contains("apple", "cherry", "banana"))); // contains all and right in order
    assertThat(strings, containsInAnyOrder("apple", "banana")); // contains all but the order is not important

    List<String>  emptyList = new ArrayList<>();
    assertThat(emptyList, empty());
  }
}
