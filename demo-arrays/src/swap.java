public class swap {
  public static void main (String [] args){
    int [] arr = new int []{100,-400,3,99};
    int tem = arr[0];
    arr[0]= arr[arr.length-1];
    arr[arr.length-1] = tem;
    for (int i =0 ; i<arr.length;i++){
      System.out.println(arr[i]);
    }
    System.out.println(swapOddEvenCharacter("a"));
    System.out.println(0%2);
  } // end  of main

  public static String swapOddEvenCharacter(String str){
    // hello! -> ehll!o
    //abcd -> badc
    // abc-> bac
    char arr [] = str.toCharArray();
    for (int i = 0 ; i<arr.length-1;i+=2){
      char tem = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = tem;
    }
    String modified  = new String(arr); //method to turn charArr to String
    return modified ;
  }


} // End of Class
