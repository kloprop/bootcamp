public class Book {
  private String author;
  private int page;

  public Book(BookBuilder builder){
    this.author = builder.getAuthor();
    this.page = builder.getPage();
  }
}
