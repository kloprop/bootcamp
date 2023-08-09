import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {
    public static void main(String[] args)  {
        int [] arr = new int[]{4, -10, 9, -20, 100};
        Arrays.sort(arr); //merge sort
        System.out.println(Arrays.toString(arr));



        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(-10);
        arrayList.add(9);
        arrayList.add(-20);
        arrayList.add(100);

        Collections.sort(arrayList); //ascending
        System.out.println(arrayList);

        // Yellow come first, if color same, id ascending order
        // If not Yellow, id descending order
        ArrayList <Ball> balls = new ArrayList<>();
        balls.add(new Ball(1, Color.RED));
        balls.add(new Ball(6,Color.YELLOW));
        balls.add(new Ball(100,Color.BLUE));
        balls.add(new Ball(10,Color.YELLOW));
        balls.add(new Ball(5, Color.RED));
        balls.add(new Ball(4,Color.YELLOW));
        
        System.out.println("Original balls: " +balls);
        Collections.sort(balls);
        System.out.println("Sorted balls with able" + balls);


    }
}
