import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        // in and out variable is the same
        // lambda
        Consumer <String> sysout = s->System.out.println(s);
        Consumer <String> sysout2 = System.out::println; //static method
        Consumer <String> sysout3 = s->System.out.println(s);
        List <Integer> list = new ArrayList<>();
        list.forEach(System.out :: println);


        String name = "john";
        Supplier <Integer> strLength = () -> "abc".length();
        Supplier <Integer> strLength2 = name ::length; // ? length()

        List<String> words = Arrays.asList("apple", "banna", "orange");

        Comparator <String> compare = (s1,s2) -> s2.compareTo(s1);
        Comparator <String> compare2 = String :: compareTo;

        Function <String, Integer> stringToInteger = str -> Integer.valueOf(str); 
        Function <String, Integer> stringToInteger2 = Integer::valueOf; 


    }
}
