import java.util.Arrays;

public class swap2 {
  public static void main (String [] args){
    int [] nums = new int[] {8,3,-10,30,100,-19};
    //Move the max number to the tail
    // {8,3,-10,30,19,100}
    int max = Integer.MIN_VALUE;
    int index =-1 ;
    for (int i =0; i<nums.length;i++){
      if (nums[i]> max){
        max = nums[i];
        index = i;
      }
    }
    int temp = nums[nums.length-1];
    nums[nums.length-1] = nums[index];
    nums[index] = temp;

    System.out.println(Arrays.toString(nums));
    System.out.println(average(nums));
    
    

  }// End of Main

  public static double average (int [] arr){
    double sum = 0;
    for (int i = 0 ; i< arr.length; i++){
      sum+= arr[i];
    }
    return sum/arr.length;
  }
} //End of Class
