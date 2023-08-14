package A_unchecked;
public class Demo_ArrayIndexOutOfBoundsException {
  public static void main(String[] args) {
    int [] arr = new int [4];

    try{
      for (int i = 0; i <= arr.length;i++){
        System.out.println(arr[i]);
      }
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("The length is not enough");
    }
  }
}
