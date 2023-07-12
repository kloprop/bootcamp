public class DataType {
  public static void main(String []args){
    //Number
    int num;//Declaration
    num=3; //Assignment
    num=7; //Reassignment

/*     System.out.println("3");
    System.out.println(3);
    System.out.println(num); */

    //Floating point
    double dig = 3.5;
    double dig2 =1.3; 
/*     System.out.println(dig); */
    
    //String
    String word;
    word="HI";
    word= "M";
    word= " ";
/*     System.out.println(word); */

    //char
    char gender ='M';
    char c= 68;
/*     System.out.println("hi"+c); */

    //Boolean
    boolean isMale = true;
    boolean isSalaryGreaterThan2000= true;




    //Others
    byte n = 1;
    short n1= 30000;
    float f = 1.89f;

    //String operation
    String str = "key";
    String str2 = "value";
    System.out.println(str+" "+str2);

    System.out.println(1.0/2.0);//0.5
    System.out.println(1.0/2);//0.5
    System.out.println(1/2);//0
    double res = 10.0/3; // 3.0
    int res1 = 10/3; // 3
    double res2 = 10.0/3.0; // 3.33333
/*     int res3 = 10.0/3.0; //error */

    System.out.println("new"+res);

    //chatAt()
    String str3 = "helloworld";
    System.out.println(str3.charAt(2));

  } //end of main

} // End of Main
