/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * 
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * 
 */
public class JavaQuest46 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] {2, 5, 6, 9, 10}));
    System.out.println(findGCD(new int[] {7, 5, 6, 8, 3}));
    System.out.println(findGCD(new int[] {3, 3}));

  }

  public static int findGCD(int[] nums) {
    if (nums.length == 0){
      return 0;
    }
    if (nums.length == 1){
      return nums[0];
    }
    int max = nums[0];
    int min = nums[0];
    for (int num : nums ){
      max = num > max? num:max;
      min = num < min? num:min; 
    }
    return getGCD(min,max);
  }
  public static int getGCD(int min, int max){
    int maxGCD = 1;
    for (int i = 2; i<=min; i++){
      if (min % i == 0 && max % i == 0 && i > maxGCD){
        maxGCD = i;
      }
    }
    return maxGCD;
  }

}
