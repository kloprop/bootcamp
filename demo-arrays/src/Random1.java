import java.util.Random;

public class Random1 {
  public static void main (String [] args){
    int num = new Random().nextInt(3)+1;
    System.out.println(randomAbcde());

  } // End of Main

  public static char randomAbcde(){
    int ran = new Random().nextInt(5)+65; // the number in nextInt show the total number for displaying
    // 65 is the range, how far from 0
    return (char) ran;
  }
} // End of Class
