import java.util.Arrays;

public class App {
    public static void main(String[] args){
        System.out.println(Math.round(5.45));  //四捨五入
        System.out.println(Math.abs(-3));
        System.out.println((int) 4.9); 
        System.out.println(Math.sqrt(26)); // return double
    
        int num = -25;
        if (num < 0 && Math.sqrt(num) == 5){
            System.out.println("Yes");
        }

        System.out.println(Math.log10(1000));// 3.0

        int [] nums = new int [] {-100, 100, 90, 50};
        System.out.println(sum(nums));
        double [] nums2 = new double[] {-5.64,5.23,9.800,6.55};
        System.out.println(sum2(nums2));
        int cubeLength = 3;
        double volume = Math.pow(3,3);
        System.out.println(volume);

        int [] bases = new int [] {2,3,4,5};
        int [] index = new int [] {3,4,5,6};
        int [] result = new int[bases.length];
        power(bases,index,result);
        System.out.println(Arrays.toString(result));

    } // End of Main

    public static int sum (int [] arr){
        int sum = 0;
        for (int num : arr){
            sum+= Math.abs(num);
        }
        return sum;
    }

    public static int sum2 (double [] arr){
        int sum = 0;
        for (double num : arr){
            sum+= Math.round(Math.abs(num));
        }
        return sum;
    }

    public static void power(int [] bases, int [] index, int[] result){
        for (int i = 0 ; i< bases.length; i++){
            result[i] = (int) Math.pow(bases[i],index[i]);
        }

    }
} //End of Class
