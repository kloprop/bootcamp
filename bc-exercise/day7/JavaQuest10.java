import java.util.Arrays;
import java.util.Scanner;

// Input a Index Position: 3
// Input a new Value: 120
// Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
// New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
//
// Input a Index Position: 10
// Input a new Value: 120
// Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
// New Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
//
// Question:
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the inputted index is the last index + 1, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here
    int[] newArr = new int[my_array.length];
    if (indexPosition < my_array.length) { // return original array

      for (int i = 0; i < indexPosition; i++) { // copy the values before indexPosition to new array
        newArr[i] = my_array[i];
      }
      newArr[indexPosition] = newValue; // insert new value
      for (int j = indexPosition; j < my_array.length - 1; j++) { // copy remaining values besides the last one
        newArr[j + 1] = my_array[j];
      }
      my_array = newArr; // overwrite the original array

    }

    /* Better version (from ChatGpt) // loop from the end til the index to add element
    if (indexPosition < my_array.length) {
      for (int i = my_array.length - 1; i > indexPosition; i--) {
        my_array[i] = my_array[i - 1];
      }
      my_array[indexPosition] = newValue;
    } */



    System.out.println("New Array: " + Arrays.toString(my_array));
  }
}
