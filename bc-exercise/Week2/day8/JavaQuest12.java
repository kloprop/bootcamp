import java.util.Arrays;

/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
   /*  int[] answers = twoSum(new int[] { 2, 7, 11, 15 }, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum */
    int[] answers4 = twoSum(new int[] { 12, 3, 6, 6},12 ); // {3, 3} is the dataset, 7 is the target to sum


/*     System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3)); */
    System.out.println(Arrays.toString(answers4));
  } // End of Main

  // Code a method here to return an array of two numbers that sum up to the
  // target
  public static int [] twoSum (int [] arr, int sum){
    //Approach 1 (sum minus every elements and using continue)
  /*   int [] tem = new int[]{-1,-1};
    for (int i = 0 ; i< arr.length;i++){ // The length can minus 1 as the last ele shall be checked with others already
      int target = sum - arr[i];
      for (int j = 0; j<arr.length;j++){ 
         if (j == i){ // Can start with i+1 to avoid using same element twice instead
          continue;
        }
  
        if (arr[j] == target){
          tem[0] = i;
          tem[1] = j;
          return tem;
        }
      }
    }
    return tem; */

    //Approach 2 (Adding every elements and avoid using continue)
    int [] tem = new int[] {-1,-1};
    for (int i = 0; i < arr.length-1; i++){ 
      for (int j = i+1; j < arr.length; j++){
        if (arr[i] + arr[j] == sum){
          tem[0] = i;
          tem[1] = j;
          return tem;
        }
      }
    }
    return tem;
  


}
 



} //End of Class
