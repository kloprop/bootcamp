import java.util.Arrays;

public class SearchArray {
  public static void main(String [] args){
    //Search

    char target = 'm';
    char [] chars = new char [] {'j','p','m','q','c'};

    for (int i = 0; i< chars.length;i++){
      if(chars[i] == target){
        System.out.println(i);
        break;
      }

    }

    //toCharArray()
    String str = "I am a boy."; //11 characters

    char [] arr = str.toCharArray();
    System.out.println(Arrays.toString(arr));
    System.out.println(arr.length);
    System.out.println(arr[2]);

    // Find Max. value in the array
    int [] nums = new int[]{5,90,57,3,99,500,2};
    
    int max = Integer.MIN_VALUE;
    for (int i = 0; i<nums.length;i++){
      if (nums[i]>max){
        max = nums[i];
      }
    }
    System.out.println(max);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i<nums.length;i++){
      if (nums[i]<min){
        min = nums[i];
      }
    }
    System.out.println(min);
  }
}
