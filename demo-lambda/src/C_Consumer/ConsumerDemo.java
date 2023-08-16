package C_Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str);

    consumer.accept("Hello");

    BiConsumer<String, String> biConsumer =
        (s1, s2) -> System.out.println(s1 + s2);
    biConsumer.accept("op", "po");

    // Example
    List<String> strings = new ArrayList<>();
    strings.add("dog");
    strings.add("cat");
    strings.add("cow");

    strings.forEach(s -> {
      int i = 0;
      if (i < 1)
        System.out.println(s);
    });

    Map<String, Integer> map = new HashMap<>();
    map.put("orange", 3);
    map.put("lemon", 2);
    map.put("watermelon", 1);
    map.forEach((key, value) -> {
      if ("lemon".equals(key)) {
        System.out.println(value);
      }
    });



    BiConsumer<String, Integer> bi = (key, value) -> {
      if (value == 1) {
        System.out.println(key);
      }
    };
    
    map.forEach((key, value) -> {
      if (value == 1) {
        System.out.println(key);
      }
    });


    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1)
        System.out.println(entry.getKey());
    }

    SuperConsumer <String,Integer,Character> ch = (str,n,chars) -> {
      System.out.println(str);};
      

      ch.accept("p", 1, 'c');



  }
}
