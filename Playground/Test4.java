package Playground;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.Collectors;

public class Test4 {
  public static void main(String[] args) {
    Map <String,Integer> map = new HashMap<>();
    map.put("john",2); 
    map.put("Mak",4); 
    map.put("Bily",7); 
    map.put("Peter",9); 
    Map <String,Integer> map2 = new HashMap<>();
    map2.put("john",2); 
    map2.put("Mak",4); 
    map2.put("Bily",7); 
    map2.put("Peter",9);  
    map2.put("Jack",10);  

    map.merge("Mak", 3, (v, v2) -> v2);
    map.computeIfAbsent("Peter", (key) -> key.length());

    map.forEach((key,value) -> map2.merge(key, value, (v1,v2) -> v1 + v2));
    System.out.println(map2);
    System.out.println(map);
    
    
  }
}

