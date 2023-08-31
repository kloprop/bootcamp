package Playground;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.StreamHandler;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Testa{
   
    public static void main(String[] args) {
        
        int [] arr = new int [] {2,3,1};
        String [] arr2 = new String[] {"St","rt"};
        List <Integer> list3 = Arrays.asList(4,4);

        Stream <Integer> stream = Stream.of(3,3,34); 
        // can not receive declared array
        // convert all types to a stream
        IntStream stream2 = IntStream.of(3,4,5,5); 
        // different from Stream <Integer>?
        // storing primitive?

        IntStream stream3 = Arrays.stream(arr);
        // accepts only declared array
        // IntStream have its own sort, but can not cutomized, boxed is required
    
        Object [] arr3 = Stream.of(3,4,5,5).sorted(Comparator.reverseOrder()).toArray();
        // Integer [] arr7 = Stream.of(3,4,5,5).sorted((n,n2) -> n2 - n).toArray(); ERROR
        // toArray () would return Object array


        int [] ar = Arrays.stream(arr).boxed()
        .sorted((a,b) -> a-b)
        .mapToInt(n -> n) // return int(IntStream) // takes any types but returns only int
        .toArray(); 

        int [] ar2 = Arrays.stream(arr).boxed()
        .sorted((a,b) -> a-b)
        .mapToInt(n -> n) // return int(IntStream) // Integer unboxing
        .toArray(); 

       

        
        Integer[] arr6 = IntStream.of(arr)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .toArray(size -> new Integer[size]); // what happened?

        Integer[] arr4 = IntStream.of(arr).boxed()
        .sorted((n,n2) -> n2 - n)
        .toArray(Integer[]::new); // how to understand

        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr4));





        // example
        List<String> list = Arrays.asList("3", "6", "8", 
                                            "14", "15");
  
        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        list.stream().mapToInt(num -> Integer.parseInt(num))
                     .filter(num -> num % 3 == 0)
                     .forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream().mapToInt(n -> n).sum();
        System.out.println(sum);

        int [] c = new int[]{2,34,5,5};
        Arrays.stream(c).min();
        
    }

    
}
