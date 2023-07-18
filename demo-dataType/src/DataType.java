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




    // Date conversion 

    byte b = 2; 
    // Upcasting (implicit coversion)
    // byte -> short -> int -> long -> float -> double
    // char -> int 
    short s = b; // byte -> short, upcasting (promotion)
    int i = s;
    double d = s;
    char p = 98;
    int t = 'p';
    System.out.println('b'+145); // char is converted into int automatically
    System.out.println("p= "+ p+" t= "+t);

/*     for (byte q = 127; q<129; q+=1){
        System.out.println(q);
    } */
 
    //ASCII (int) to char

    int g = 'k';
    char g1 = 3;
    char k =  (char)g; //downcasting 
    char k1 = 126; // 66 is ASCII code, must without variable shoring 
    System.out.println(k1);
    // int -> char is downcasting, char -> int is upcasting.
    // int and char can be converted freely when there is only data itself but not variable.
    // if the data is stored in variable, the rule applys.


    //big to small not ok as data is lossed, small to big is ok
    int h = (int)1000L; //rule is applied
    short s10 = 128; // 
    byte o = (byte) s10; // rule is applied
    byte o2 = 127L; // what if 128
    byte o2sdf =  129; // what if 128
    System.out.println(o2sdf);
    byte z = 127;
    z+=1;
    byte o23 = z+1;
    for (byte j = 127; i<130; i++){

    }
  } //end of main

} // End of Main
