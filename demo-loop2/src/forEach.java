import java.util.Arrays;

public class ForEach {
  public static void main (String [] args){
    // basic 
    for (int i = 0; i<3; i++){
      System.out.println("hello");
    }

    // For-each
    int [] arr = new int []{1,2,3,4};
    for (int n:arr){
      System.out.println(n);
      arr[0] = 8; // Can change the ele in the arr 
    }

    for (String str: new String [] {"ho","go"}){
      System.out.println(str);
    }

    for (Character c : new Character [] {'c','k','l'}){
      System.out.println(c);
    }

    String s2 = "Hello I am Ken";
    String [] strings = s2.split(" ");
    for (String s: strings){
      System.out.println(s);
    }
/*     // Approach 1 (using substring)
    int numOfEle = 0;
    for (char c : s2.toCharArray()){
      if (c == ' '){
        numOfEle +=1;
      }
    }
    String []  strings2 = new String[numOfEle+1];
    int begInd = 0;
    for (int i = 0, j = 0; i < s2.length(); i++){
      char c = s2.charAt(i);
      if (c == ' '){
        String tem  = s2.substring(begInd, i);
        strings2[j] = tem;
        j++;
        begInd = i+1;
      }
      else if ( i == s2.length()-1){
        strings2[j] = s2.substring(begInd, s2.length());
      }
    }
    System.out.println(Arrays.toString(strings2));

   // Approach 2 (using charAt only)
    String [] arr2 = new String[4]; 
    String temp ="";
    
    int j = 0;
    for (int i = 0; i< s2.length(); i++){
      if (s2.charAt(i) != ' '){
        temp+= s2.charAt(i);
      }
      if (s2.charAt(i) == ' ' || i == s2.length()-1){
        arr2[j] = temp;
        temp = "";
        j++;
      }
    
    }
    System.out.println(Arrays.toString(arr2)); */
 

    // Approach 3 (charArray)
    char [] cArr = s2.toCharArray();
    String [] arr3 = new String[4];
    String tem2 = "";

    int k = 0;

    for (int i = 0 ; i< cArr.length; i++){
      if ( cArr[i] != ' '){
        tem2 += cArr[i];
      }
      if (cArr[i] == ' ' || i == s2.length()-1){
        arr3[k] = tem2;
        tem2 = "";
        k++;
      }
    }
    System.out.println(Arrays.toString(arr3));
  } //End of Main
} // End of Class
