import java.util.Arrays;

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    // code here
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    //easy way with two variables
    int max;
    int secondMax;
    int [] arr = nums4;
    if (arr[0]>arr[1]){
      max = arr[0];
      secondMax = arr[1];
    }
    else{
      max = arr[1];
      secondMax = arr[0];
    }

    for (int i = 2; i<arr.length;i++){
      if (arr[i]>max){
        secondMax = max;
        max = arr[i];
      }
      else if (arr[i]>secondMax){
        secondMax = arr[i];
      }
    }
    System.out.println(secondMax);


    //sorting? approach with single varible
    for (int i= 0;i<2;i++){
      for (int j=0; j<arr.length-1;j++){
        if (arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    secondMax = arr[arr.length-2];
    System.out.println(secondMax);
  }//end of main
}