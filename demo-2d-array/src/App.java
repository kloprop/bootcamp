import java.util.Arrays;
import java.util.Random;

public class App {
    private int age = 4;

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3};
        // int[] nums;-> declaration
        // new int[3];-> initialization

        nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // re-assignment

        int[][] matrix = new int[3][4]; // new int[row][column] // row is the number if array, column is the number inside


        // random a number and assing to an 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = new Random().nextInt(13);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int [] arr = new int[matrix.length*matrix[0].length];

        int ind = 0;
        for (int i = 0 ; i < matrix.length ;i++){
            for (int j = 0; j< matrix[0].length; j++){
                 arr[ind++] = matrix[i][j];
            }
        }

        String str = "";
        for (int i = 0; i< matrix.length; i++){
            for (int j= 0 ; j< matrix[0].length; j++){
                str+= matrix[i][j];
            }
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(str);

        Demo[][] demo = new Demo[2][2];
        demo[0][0] = new Demo();
        demo[0][1] = new Demo();
        demo[1][0] = new Demo();
        demo[1][1] = new Demo();

        for (int i = 0; i<demo.length; i++){
            for (int j = 0; j<demo[0].length; j++){
                System.out.println(demo[i][j].getAge());
            }
        }

        String [] [] strs = new String[][] {{"abc","def"},{"ghi","jkl"}};
    }
}
