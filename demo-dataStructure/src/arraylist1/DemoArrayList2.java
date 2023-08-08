package arraylist1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DemoArrayList2 {
  public static void main(String[] args) {
    ArrayList <String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");

    // SubList
    System.out.println(strs.subList(1,2)); // "def"
    strs.remove("def"); // remove first occurance of obj
    System.out.println(strs); // ["abc", "xyz", "def"]
    strs.remove(1);
    System.out.println(strs); // ["abc", "def"]

    // Iterator (for each loop)
    Iterator<String> iterator = strs.iterator(); // Support ArrayList
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    } 
    // Short-hand
    /* while (strs.iterator().hasNext()){
      System.out.println(strs.iterator().next());
    } */
    for (String str : strs){ // Support array and arraylist
    }

    Object [] objects = strs.toArray(); // ArrayList<String> -> Object[]
    // Convert any array to ArrayList
    for (Object obj : objects){
      if (obj instanceof String){
        String str = (String) obj;
        System.out.println(str);
      }
    }

    // Array -> ArrayList
    String [] strings = new String []{"Hello", "World"};

    List <String> s2 = new ArrayList<>(); // Parent interface store child 
    s2.add("abc"); // add() must belong to child as List is interface
    // Inhertence may worry about whether the method is overridden

    // Read Only -> big bug
    List<String> stringList = Arrays.asList(strings); // return fixed length array list
    //stringList.add("d"); // run time error

    //Read and write 
    List <String> stringList2 = new ArrayList<>(Arrays.asList(strings));
    stringList2.add("ijk");
    System.out.println(stringList2.getClass());


    
  }
}
