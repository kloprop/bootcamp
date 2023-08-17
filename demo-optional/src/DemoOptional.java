import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) throws Exception {
    List <Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Jimmy"));
    books.add(new Book("Apple"));
    books.add(new Book("Billy"));
    books.add(new Book("Cathy"));
    books.add(new Book("Dick"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));

    Optional <Book> book = books.stream()//
    .filter(b -> b.author.startsWith("J"))//
    .findAny();//

    Book book7 = books.stream()//
    .filter(b -> b.author.startsWith("Z"))//
    .findAny()//
    .orElseGet(() -> new Book("Defalut"));//

    System.out.println("Test " + book7);
    



    
    book.ifPresent(e -> System.out.println(e));
    
    
    Optional <Book> book2 = Optional.of(new Book("Eric"));
    //Optional <Book> book3 = Optional.of(null); run-time error
    Optional <Book> book6 = Optional.ofNullable(null); // The value that stored in optional is null
    System.out.println(book6.isEmpty()); 
    Optional <Book> book4 = Optional.ofNullable(new Book("Jenny"));
    Optional <Book> book5 = Optional.empty(); // no value in optional
    System.out.println(book5.isPresent()); // whether the value inside present

    //System.out.println(book.get()) ;

    Book newBook = book5.orElse(new Book("Default")); // orElse provide default which ensure that the optional can be unboxed
    Book newBook2 = book5.orElseGet(()->new Book("Default")); 
    //Book newBook3 = book5.orElseThrow(()-> new Exception());  

   
  }
   public static Optional<Book> getBook(){ //Optional shall not be parameter
      return Optional.empty();
    }
   public static Optional<List<Book>> getBook2(){ //Optional shall not be parameter
      return Optional.empty();
    }
}
