package Playground;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    String[] strings =
        {"CSS", "Java", "HTML", "css", "sql", "javac", "javascript", "SQL"};

    Arrays.sort(strings, (String s1, String s2) -> {
      int c = s2.length() - s1.length();
      if (c == 0)
        c = s1.compareToIgnoreCase(s2);// from w ww .j a v a 2s. c om
      return c;
    });

    System.out.println(Arrays.toString(strings));

    Queue<Integer> queue = new ArrayDeque<>();



    Map<String, Integer> map = new HashMap<>();
    map.put("A", 3);
    map.put("B", 4);
    map.put("C", 6);
    map.put("C", 6);

    map.put("C", 6);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

    for (String key : map.keySet()) {
      System.out.println(key);
    }



  }
}
