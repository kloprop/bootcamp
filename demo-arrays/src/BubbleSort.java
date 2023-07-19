import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // Step 1.1 : [1,5,4,8,2]
    // Step 1.2 : [1,4,5,8,2]
    // Step 1.3 : [1,4,5,8,2]
    // Step 1.4 : [1,4,5,2,8]
    // Step 2.1 : [1,4,5,2,8]
    // Step 2.2 : [1,4,5,2,8]
    // Step 2.3 : [1,4,2,5,8]
    // target : [1,2,3,4,5,8]
    int[] nums = new int[] {5, 1, 4, 8, 2};
    System.out.println(Arrays.toString(sort(nums)));
    System.out.println(Arrays.toString(insection(nums)));
  } // End of Main

  public static int[] sort(int[] arr) {
    for (int i = 0; i<arr.length-1; i++){
    for (int j = 0 ; j<arr.length -1- i;j++){
      if (arr[j]>arr[j+1]){
        int tem = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = tem;
      }
    }
  }
  return arr;
  }

  public static int [] insection (int [] arr){
    for (int i = 0 ; i<arr.length;i++){
      int target = arr[i];
      for (int j = i; j>= 0 && arr[j-1]> arr[i];j--){
        int tem = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] =tem;
      }
    }
    return arr;
  }
} // End of Class
