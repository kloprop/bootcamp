public class BookBuilder {
  private String author;
  private int page;

  public BookBuilder author(String author){
    this.author = author;
    return this;
  }
  public BookBuilder page(int page){
    this.page = page;
    return this;
  }
  public String getAuthor(){
    return this.author;
  }
  public int getPage(){
    return this.page;
  }
  public Book build(){
    return new Book(this);
  }
  
}
