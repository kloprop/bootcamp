import Student.Bag;

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
  



  public static void main(String[] args) {
        Student student = new Student("Peter");
        Student.Bag bag = new Student.Bag(); // create static nested class
        //bag.name();
        System.out.println(bag.name());
        Student.Grade grade = student.new Grade(90); // create non-static nested class

        // Bag bag1 = new Bag();
        System.out.println(bag.getClass());
        // System.out.println(bag1.getClass());
    
        
        grade.printStudentName();
    

  }
}
