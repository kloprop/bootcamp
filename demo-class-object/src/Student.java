public class Student {
  // State / Instance Variables
  private String firstName;
  private String lastName;
  private int age;

  public Student (String firstName, String lastName,int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;

  }

  // Behaviors/ Methods

public String fullName (){
  return this.firstName + " "+ this.lastName;
}

public static boolean isAdult(int age){
  if (age>=18){
    return true;
  }
  return false;
  //return this.age>= 18;
}

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setAge (int age){
    this.age = age;
  }
}
