package A_arraylist1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Pratice {
  public static void main(String[] args) {
    
    ArrayList <Integer> list  = new ArrayList<>();
    list.add(3);
    list.add(4);
    list.add(5);

    list.remove(Integer.valueOf(4));
    String [] strs = new String[]{"hello","df","d","d"};
    ArrayList<String> list2 = new ArrayList<>(Arrays.asList(strs));
    List <Integer> list3 = new ArrayList<>();
    Iterator<Integer> it = list3.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

    HashMap <String,ArrayList<Integer>> map = new HashMap<>();
    map.put("hjh", new ArrayList<>());

    for (Map.Entry<String,ArrayList<Integer>> entry : map.entrySet()){
      System.out.println(entry.getKey());
      System.out.println(map.get("p"));
      for (Integer i : entry.getValue()){
        System.out.println(i);
      }

      for (ArrayList<Integer> i : map.values()){
        for (Integer ie : i ){
          System.out.println(ie);
        }
      }
    }
  
  



  }
}
