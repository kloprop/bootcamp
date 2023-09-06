package Playground;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.management.Query;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Test2  {
  
  public static void main(String[] args) {
    List <Test> list = new LinkedList<>();
    list.add(new Test(34));
    list.add(new Test(40));
    list.add(new Test(24));
    list.add(new Test(44));

    Map <Double, List<Test>> map = list.stream()//
                                  .collect(Collectors.groupingBy(t -> t.getHeight()));
    
    
    System.out.println(map);

    Map <Double, Test> map2 = list.stream().collect(Collectors.toMap(t -> t.getHeight(),t->t));

    map2.entrySet().stream()
                    .map(entry -> entry.getKey())
                    .collect(Collectors.toList());


  List <Integer> list2 = new ArrayList<>();
  
  Integer [] arr = new Integer []{2,3};
  List <Integer> list3 = new LinkedList<>(Arrays.asList(3,4));
  List <Integer> list4 = List.of(3,4,8);
  // list4.add(4);
  list3.add(4); 
  int [] arr3 = new int[]{4,55};
  IntStream.of(arr3);
  IntStream.of(34,34,34);
  List <Integer> list5 = new LinkedList<>(Arrays.asList(3,4,5));
  int n1 = list5.stream().mapToInt(e -> e).sum();
  int n = list5.stream().reduce(0, (sub, e) -> sub+e);
  System.out.println(n);
  System.out.println(n1);
  
  List <Integer> list7 = new LinkedList<>(Arrays.asList(arr)); 
  list7.add(4);
  Test [] arr6= new Test[]{new Test(6)}; 
  Arrays.stream(arr6).collect(Collectors.toCollection(LinkedList :: new));
  // List <Integer> list8 = new LinkedList<>(List.of(arr3)); 

  
  

  }
  
  



   
    
    
  
}