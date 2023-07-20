import java.util.Arrays;

public class insectionSort {
  public static void main (String [] args){
    // [5, 1, 4, 8, 2]
    //Step 1.1: [1, 5, 4, 8, 2] (insert 1 to arr[0], 1 < 5)
    //After round 1, [1,5] is sorted
    //Step 2.1: Compare 4 < 5[1, 5, 4, 8, 2]
    //Step 2.2: Compare 1 < 4[1, 4, 5]
    //After round 2, [1, 4, 5] is sorted
    int [] arr = new int [] {1,3,5,1,4,8,2,7,3,6,0,100,99,45,89};
    System.out.println(Arrays.toString(insection(arr)));
    //System.out.println(Arrays.toString(insert(arr, 4, 5)));

    


  } // End of Main

  public static int[] insection(int[] arr){
    for (int i = 1 ; i< arr.length;i++){
      int key = arr[i];
      for (int j = i; j> 0 && arr[j-1] > key;j--){
        int tem = arr[j];
        arr [j] = arr[j-1];
        arr[j-1] = tem;
      }
      
      
    }
    return arr;

    // Approach 2 (using while loop)
/*     for (int i = 1; i<arr.length;i++){
      int key = arr[i];
      while (i >0 && arr[i-1]>key ){
        int temp = arr[i-1];
        arr[i-1] = arr[i];
        arr[i] = temp;
        i--;
      }
    }
    return arr; */
  }

  /* public static int [] insert(int []arr, int ind, int num){
    for (int i = arr.length-1; i > ind ; i-- ){
      arr[i] = arr[i-1];
    }
    arr[ind] = num;
    return arr;
  } */
} // End of Class
