package Playground;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] strings = { "CSS", "Java", "HTML", "css", "sql", "javac", "javascript", "SQL" };

    Arrays.sort(strings, (String s1, String s2) -> {
      int c = s2.length() - s1.length();
      if (c == 0)
        c = s1.compareToIgnoreCase(s2);//from  w ww  .j  a v  a  2s.  c  om
      return c;
    });

    System.out.print(Arrays.toString(strings));
  }
}
