package arraylist1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers2 = new ArrayList<>(); // empty array
        numbers2.add(1); // length 1 array
        numbers2.add(3); // length 2 array
        numbers2.add(2); // length 3 array
        numbers2.add(4); // length 4 array
        // numbers.add((Integer) Long.valueOf(3)); Cannot cast Long to Integer
        // variable-length

        // Conversion, ArrayList -> Wrapper class or object Array
        Integer[] arr2 = new Integer[numbers2.size()];
        // Define output array type for toArray() perform conversion
        arr2 = numbers2.toArray(arr2);
        System.out.println(Arrays.toString(arr2)); // [1,3,2,4]

        // get method
        for (int i = 0; i < numbers2.size(); i++) {
            System.out.println(numbers2.get(i));
        }


        // set method
        int original = numbers2.set(2, 100);
        System.out.println("Original" + original); // 2



        for (Integer num : numbers2) {
            System.out.println(num);
        }

        System.out.println(numbers2.toString());
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(1000);
        numbers3.add(2000);
        // addAll(ind, arr) / addAll(arr)
        numbers2.addAll(numbers3); // add all items from numbers3 to numbers2

        System.out.println(numbers2.toString());

        // removeAll(ind, arr) / removeAll(ind,arr)

        numbers2.removeAll(numbers3); // remove Integer 1000,2000
        System.out.println(numbers2.size()); //

        System.out.println("numbers2: " + numbers2); // toString is overridden

        // Contains
        System.out.println(numbers2.contains(3));
        System.out.println(numbers2.contains(9000));

        // lastIndexOf()
        System.out.println(numbers2.lastIndexOf(2));

        numbers2.add(1, 4);
        System.out.println(numbers2);


        // Remove
        numbers2.remove(1);
        System.out.println(numbers2.remove(1));
        System.out.println(numbers2);

        // clear
        numbers2.clear(); // remove all elements
        System.out.println(numbers2.size());
        // isEmpty()
        System.out.println(numbers2.isEmpty());


        ArrayList<String> strs = new ArrayList<>();
        strs.add("abc");
        strs.add("def");
        strs.add("xyz");
        strs.add("def");

        // subList -> return List
        System.out.println(strs.subList(1, 2)); // "def"
        List<String> arr = strs.subList(1, 2);//new ArrayList<>(strs.subList(1, 2));
        strs.remove("def"); // remove first occurance of obj
        System.out.println(strs); // ["abc", "xyz", "def"]
        strs.remove(1);
        System.out.println(strs); // ["abc", "def"]

        // Iterator (for each loop)
        Iterator<String> iterator = strs.iterator(); // Support ArrayList
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Array -> ArrayList
        String[] strs2 = new String[]{"h","r"};
        List <String> list = new ArrayList<>(Arrays.asList(strs2));

    }
}
