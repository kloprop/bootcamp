package hashmap1;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    HashMap <String, String> map = new HashMap<>();
    map.put("abc", "hello world"); // entry
    map.put("bcd", "I am Developer"); // entry

    System.out.println(map.size()); // 2 entries
    // Map.entry -> Key + value
    
    // if Duplicated (), override the entry
    System.out.println(map.put("abc", "hello world !!!")); // Override the entry with key "abc"
    System.out.println(map.get("abc")); // hello world !!!
    System.out.println(map.size()); // 2 entries

    System.out.println(map.isEmpty());// false (Size equal to zero)
    System.out.println(map);

    // contain
    System.out.println(map.containsKey("abc")); //true
     
    System.out.println(map.containsValue("I am Developer")); //false

    // Loop Entries
    for (Map.Entry<String, String> entry:map.entrySet()){
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    // Loop keys
    for (String key : map.keySet()){
      System.out.println(key);
    }

    // Loop values
    for (String value : map.values()){
      System.out.println(value);
    }
   
    //remove
    System.out.println(map.remove("abc")); // return removed value
    System.out.println(map.remove("abc","I am not developer")); // return boolean

  }


}
