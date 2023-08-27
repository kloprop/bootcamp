public class Book {
  private String author;
  private int page;

  public Book(BookBuilder builder){
    this.author = builder.getAuthor();
    this.page = builder.getPage();
  }
  public static BookBuilder builder(){
    return new BookBuilder();
  }
  public static void main(String[] args) {
    Student student = new Student("John");
    Student.Bag bag = new Student.Bag();
    

    System.out.println(bag.getClass());
    

    
    Student.Grade grade = student.new Grade(90);
    grade.printStudentName();



}
}
