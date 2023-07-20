import java.util.Arrays;

public class forEach {
  public static void main (String [] args){
    // basic 
    for (int i = 0; i<3; i++){
      System.out.println("hello");
    }

    // For-each
    int [] arr = new int []{1,2,3,4};
    for (int n:arr){
      System.out.println(n);
      arr[0] = 8; // Can the ele in the arr 
    }

    for (String str: new String [] {"ho","go"}){
      System.out.println(str);
    }

    for (Character c : new Character [] {'c','k','l'}){
      System.out.println(c);
    }

    String s2 = "Hello world ! I am Ken";
    String [] strings = s2.split(" ");
    for (String s: strings){
      System.out.println(s);
    }

    String []  strings2 = new String[6];
    int begInd = 0;
    for (int i = 0, j = 0; i < s2.length(); i++){
      char c = s2.charAt(i);

      if (c == ' ' || i == s2.length()-1 ){
        int spaceLoc = s2.indexOf(' ',begInd);
        if (i == s2.length()-1){
          spaceLoc = s2.length();
        }

        /* System.out.println("beg="+begInd);
        System.out.println("end="+spaceLoc);
        System.out.println(); */
        String tem  = s2.substring(begInd, spaceLoc);
        strings2[j] = tem;
        j++;
        begInd = spaceLoc+1;
      
      }
    }
    System.out.println(Arrays.toString(strings2));

  } //End of Main
} // End of Class
