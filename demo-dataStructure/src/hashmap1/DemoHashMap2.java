package hashmap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import hashset1.Book;

public class DemoHashMap2 {
  public static void main(String[] args) {
    HashMap<Integer,Book> books = new HashMap<>();
    books.put(128, new Book("Book1"));
    books.put(Integer.valueOf(128), new Book("Book2"));
    //System.out.println(books.size()); // 1

    HashMap<Author, Book>  bookMap = new HashMap<>();
    // Author unique key? -> equals(), hashCode()
    Author author1 = new Author("John", 30);
    Author author2 = new Author("John", 29);
    bookMap.put(author1, new Book("Book3"));
    bookMap.put(author2, new Book("Book4"));
    //System.out.println(bookMap); 

    HashMap <Author, ArrayList<Book>> bookMap2 = new HashMap<>();
    ArrayList <Book> booklist1 = new ArrayList<>();
    booklist1.add(new Book("Book1")); 
    booklist1.add(new Book("Book2"));
    ArrayList <Book> booklist2 = new ArrayList<>();
    booklist2.add(new Book("Book3")); 
    booklist2.add(new Book("Book4"));
    
    bookMap2.put(author1, booklist1);
    bookMap2.put(author2, booklist2);
    System.out.println(bookMap2.size());

    // Loop bookMap2, print out all the books from each Author

    for (Map.Entry<Author,ArrayList <Book>> author : bookMap2.entrySet()){
      //System.out.println(author.getKey().name);
      for (Book book : author.getValue()){
        System.out.println("Author Name: " + author.getKey()+ "Book Name: "+ book);
      }

    }
    for (Book book : bookMap2.get(author1)) {
      System.out.println(book);
    };
  }
}
