import java.util.Arrays;

public class Array3 {

  public static void addOne(int[] arr){ // arr -> object reference
    for (int i = 0 ; i< arr.length; i++){
      arr[i] = arr[i] + 1;
    }
  }

  public static String concat(String s1, String s2){ //Wrapper class + String -> pass by value
    s1= "hello";
    return s1+s2; //return new obj
  }
  public static void main (String [] args){
    int [] nums = new int []{3,4,8};
    addOne(nums); // passing object reference, change the original array
    System.out.println(Arrays.toString(nums));

    // Call concat
    String a = "abc";
    String b = "def";
    System.out.println(concat(a,b)); // hellodef ,passing copy, creating two copy obj
    System.out.println(a);
    
  }
}
