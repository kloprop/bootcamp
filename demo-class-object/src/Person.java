public class Person { // class is a template for generating object
  //Describe the person by attributes
  private int age;
  private char gender;

/*   public static boolean isMale(char gender){ //belong to class ,static rely on data that outside the object
    if (gender == 'F'){
      return false;
    }
    return true;
  } */

  public static boolean isMale (char gender){
    if (gender == 'M'){
      return false;
    }
    return true;
  }


  public boolean isMale(){
    if (this.gender == 'F'){
      return false;
    }
    return true;
  }

  // setter
  public void setAge (int age){
   this.age = age;

  }
  public void setGender(char gender){
    this.gender = gender;
  }
  // getter
  public int getAge (){
    return this.age;
  }
  public char getGender(){
    return this.gender;
  }
 

  public  static void main(String [] args){ //jvm execute this (instructed by user)
    String s = "abc";
    Person p = new Person(); // Produce empty person object  created p in memory 
    Person p2 = new Person();
    p.setAge(13);
    System.out.println(p.age);
    System.out.println(p2.age);
    Person p3 = new Person();
    System.out.println(p3.age);
    System.out.println(p3);

    //static vs non-static
    //static 
    isMale('F'); //false

    // non-static
    p.isMale(); //true
    
    Computer computer = new Computer(); // Computer() -> empty constructor

    Computer computer2 = new Computer("Yellow");
    computer2.getColor();
    
    

    
  } // End of Main
  
} // End of Class


