package B_checked;

public class Student {
  String name;

  public Student (){

  }

  public Student(String name){
    this.name = name;
  }

  public void setName(String name) throws NameTooLongException,NameTooUglyException{ // caller handle
    if (name.contains("j")){
      throw new NameTooUglyException("Your name is ugly");
    }
    if (name.length() > 10){
      throw new NameTooLongException("Name is too long(> 50)");
    }
    this.name = name;
  }

 /*  public static void main(String[] args) throws NameNotMatchException{
    Student student = new Student("John");
    student.setName("ds"); // if exception, throw it to the caller
  } */
  public static void main(String[] args) throws NameTooLongException { // trigger once one time?
    Student student = new Student("John");

  /* try{ student.setName("dshjfhjfhgfgh"); // checked exception
  }catch (NameTooLongException e ){
    System.out.println("Nothing happen");
  } */
  try{
    student.setName("dshjfhjfhgfgh");
  }catch(NameTooUglyException e){
    System.out.println("Your name is good");
  }



  Student student2 = new Student ();
  try {
    student2.name.length();
  }
  catch(NullPointerException e){
    System.out.println("ds");
  }
  }
}
