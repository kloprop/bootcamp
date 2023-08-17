import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("ghi");
        strings.add("def");

        // for-each
        /*
         * for (String str : strings){ System.out.println(str); }
         */

        // stream (instance method, return a stream)
        Stream<String> streamStrings = strings.stream();
        // Filtering
        streamStrings = streamStrings.filter(s -> s.startsWith("a"));
        streamStrings.forEach(s -> System.out.println(s));

        strings.stream().filter(s -> s.endsWith("i"))
                .forEach(s -> System.out.println(s));

        List<String> strings2 = strings.stream()//
                .filter(s -> s.length() == 3)//
                .collect(Collectors.toList());

        System.out.println(strings2.size());// 3

        List<Integer> lengths = strings2.stream()//
                .filter(e -> e.startsWith("a") || e.startsWith("d"))//
                .map(e -> e.length())//
                .collect(Collectors.toList());


        lengths.forEach(e -> System.out.println(e));
        // sorted
        strings2.stream()//
                .sorted((s1, s2) -> s2.compareTo(s1))//
                .collect(Collectors.toList())
                .forEach(e -> System.out.println(e));

        // anyMatch
        if (strings2.stream().anyMatch(e -> e.startsWith("a"))) {
            System.out.println("One of the elements start with a");
        }

        List<Character> chars = strings2.stream()//
                .map(e -> e.charAt(0))//
                .collect(Collectors.toList());

        System.out.println(chars); // how to convert all chars in string to map;
        // interminated operations:
        // filer(), map(). sorted(), anyMatch()

        // terminated operations
        // collect(), forEach(), count()

        // Stream can only terminate once, but it may hava multiple interminate operations

        List<Person> persons = Arrays.asList(new Person("John", 30), new Person("Mary", 25));
        persons.forEach(e -> System.out.println(e.getAge()));

        List<Integer> ages = persons.stream()//
                .map(e -> e.getAge())//
                .collect(Collectors.toList());

        ages.forEach(e -> System.out.println(e));

        // Stream static method
        Long l = Stream.of("ddd", "ddd", "ddd")//
                .filter(e -> e.length() == 3)//
                .distinct()//
                .count();

        long l2 = Stream.of(1, 2, 3, 4)//
                .map(e -> {
                    System.out.println(e);
                    return e;
                }).count(); // terminate operation

        System.out.println(l2);

        Stream<Integer> strea = Stream.of(1, 2, 3, 4)//
                .filter(e -> e == 2)//
                .map(e -> {
                    System.out.println(e);
                    return e;
                });

        int setSize = Stream.of(1, 2, 3, 3)//
                .collect(Collectors.toSet()).size();

                
        Map <String, Integer> animalMap =  Arrays.asList("lion","tiger","bear")
        .stream() //
        .collect(Collectors.toMap(str -> str,str -> str.length() ));

        //Loop
        for (Map.Entry<String, Integer> entry : animalMap.entrySet()){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
        }

        Stream.iterate(1, n -> n+2)//
        .limit(10)//
        .forEach(e -> System.out.println(e));

        // Group by

    }

    public static Person findPerson(List<Person> persons) {
        return persons.stream()//
                .filter(e -> e.isElderly())//
                .findFirst()//
                .orElse(null);
    }
}
