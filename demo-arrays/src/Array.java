import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int num = 7;
    int num2 = 8;
    int num3 = -30;

    // Create empty array
    int[] nums = new int[3]; // Length of the array
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;

    System.out.println(Arrays.toString(nums));

    double[] marks = new double[2];
    marks[0] = 2.2;
    marks[1] = 6.2;

    System.out.println(Arrays.toString(marks));

    String[] names = new String[3];
    names[0] = "Peter";
    names[1] = "John";
    names[2] = "Mark";

    System.out.println(Arrays.toString(names));

    for (int i = 0; i < nums.length; i++) {
      System.out.println("nums[" + i + "]= " + nums[i]);
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.println("nums[" + i + "] " + nums[i]);
    }

    // Create array and add element at the same time
    int[] array = new int[] {3, 9, 12};
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // char[]
    char[] chars = new char[3];
    chars[0] = '!';
    chars[2] = 'a';

    // long []
    long[] numbers = new long[4];
    System.out.println(Arrays.toString(numbers));

    // String []
    String[] strs = new String[] {"hello", "bye"};
    strs[1] = "typhoon";
    for (int i = 0; i < strs.length; i++) {
      System.out.println("strs[" + i + "]" + strs[i]);
    }



  }// end of main
} // End of Main
