package B_hashset1;

import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc")); //true
    strings.add("def");
    
    System.out.println(strings.size()); // 2
    System.out.println(strings.add("abc")); //false
    System.out.println(strings.size()); //2

    if (strings.add("def")){
      System.out.println("def is printed");
    }else{
      System.out.println("not printed");
    }

    //Example 2 : With override equal() method
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    coordinates.add(c1); //Added
    coordinates.add(c2); // Not added
    System.out.println(coordinates.size());

    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3));
    System.out.println(coordinates.size());

    //Example 3 : without override equal() method

    HashSet <Book> books = new HashSet<>();
    System.out.println(books.add(new Book("John"))); // true
    System.out.println(books.add(new Book("John"))); // true 
    System.out.println(books.add(new Book("Peter"))); // true 

  }
}
