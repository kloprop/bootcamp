import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomStuff {
  public static void main(String[] args) {
/*     //half diamiond with two for loops
    int maxStar = 3;
    String word = "";
    for (int i = 0; i < maxStar ; i++) {
      word += "*";
      System.out.println(word);
    } // create first half 
    for (int i = word.length() - 1; i > 0; i--) {
      System.out.println(word.substring(0, i));
    }// remaining parts */

/*     // Date and time
    Date date = new Date();
    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/YY");
    SimpleDateFormat dateFormatter2 = new SimpleDateFormat("dd/MMMM/YY"); // four M provides full name
    SimpleDateFormat dateFormatter3 = new SimpleDateFormat("dd/MM/YY HH:mm"); 
    SimpleDateFormat dateFormatter4 = new SimpleDateFormat("HH"); 
    SimpleDateFormat dateFormatter5 = new SimpleDateFormat("mm"); 
    System.out.println(date);
    System.out.println(dateFormatter.format(date));
    System.out.println(dateFormatter2.format(date));
    System.out.println(dateFormatter3.format(date));
    System.out.println("Current time : "+dateFormatter4.format(date)+"時"+dateFormatter5.format(date)+"分");

    Calendar date2 = Calendar.getInstance();
    System.out.println(date2.getTime());
    System.out.println(dateFormatter.format(date2.getTime())); */


/*     int len = 11;
    for (int i = 0; i<len;i++){
      for (int j = 0, k=len-1-i;j<len;j++ ){
        if (i==0 ||i ==len-1){
          System.out.print("*");
        }
        else{
          if (k== j){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        
    }
    System.out.println();
  }  */

  /* int numOfLine = 11;

  for (int i = 0 ,k=numOfLine-i-1; i < numOfLine ;i++,k-=2){
    if (k < 0){
      break;
    }
    for (int j = 0;j<numOfLine;j++){
      if (j==k){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }

    }
    System.out.println("");
  }

  for (int i = 0 ,k= i+2; i < numOfLine/2 ;i++,k+=2){
    for (int j = 0;j<numOfLine;j++){
      if (j==k){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }

    }
    System.out.println("");
  } */

/*   //diamond star pattern 1
  int maxNumStar = 7;
  int firstPatternEnd = maxNumStar/2+1;
  for (int i = 0,left =maxNumStar/2,right = maxNumStar/2; i<firstPatternEnd ; i++,left--,right++){
    for (int j = 0; j<maxNumStar;j++){
      if (left == j || right ==j ){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  for (int i = 0,left =0+i+1,right = maxNumStar-1-i-1; i<firstPatternEnd-1 ; i++,left++,right--){
    for (int j = 0; j<maxNumStar;j++){
      if (left == j || right ==j ){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  } */

  //diamond star pattern 2
  int maxNumStar = 7;
  int firstPatternEnd = maxNumStar/2+1; //Print the first half without useing break
  for (int i = 0,left = maxNumStar/2,right = maxNumStar/2; // Left and right pointer for printing star
      i<firstPatternEnd ; // Rows
      i++,left--,right++){ // Move the pointers
    for (int j = 0; j<maxNumStar;j++){ // Columns
      if ( j>=left  && j<=right ){ // Area to print star (between two pointers)
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  for (int i = 0,left = 0+i+1,right = maxNumStar-1-i-1; // Remaining half (aware pointers position)
      i< firstPatternEnd-1 ; i++, //Rows
      left++,right--){ // Move the pointers
    for (int j = 0; j<maxNumStar;j++){
      if (j>=left  && j<=right ){ // Area to print stars
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }

// Luck tester
  int count = 0;
  boolean get = false;
  while (!get){
    int tem = (int)(Math.random()*11);
    count+=1;
    if (tem == 10){
      break;
    }

  }
  if (count<=5){
    System.out.println("Very lucky");
  }
  else if (count<=10){
    System.out.println("Lucky");
  }
  else if (count<=15){
    System.out.println("Normal");
  }
  else if (count<=20){
    System.out.println("Bad lucky");
  }
  else {
    System.out.println("Be careful");
  }
  System.out.println(count);
  
  int [] nums = new int[] {1,2,3};
  int [] nums1 = new int[] {4,5,6};
  nums = nums1;
  System.out.println(Arrays.toString(nums));
  
/*   byte b = 1;
  b+=1;
  b = b+1;
  System.out.println(b); */
  
  int ran = new Random().nextInt(2);
  System.out.println(ran);

  // get the number of integer
  int num = 999;
  int i = num;
  int divide = 1;
  while (i> 10){
    i/= 10;
    divide *=10;
  }
 int ran3 = new Random().nextInt(11)+20;
 System.out.println(ran3);

 StringBuilder sb = new StringBuilder ("rtyui");
 StringBuilder sb1 = new StringBuilder ("rtyui");
 sb1 = sb;
 sb.append (5);

 System.out.println(sb.toString());
  System.out.println(sb.equals(sb1));

  char c = 'c';
  System.out.println(c == 'c'? 'c':"no");
  double d = 4.11235;
  double d1 = 2.045252;
  System.out.println(d/d1);
  char cg = 'u';

  StringBuilder seeee = new StringBuilder();
  

  

StringBuilder sb56 = new StringBuilder("abc");
char ch = sb56.append("null").charAt(1);
System.out.println(ch);

Integer [] arr = new Integer[]{1,3,4,4,2,5,6};
Arrays.sort(arr,(n,n2) -> {
  if (n > n2){
    return -1;
  }else{
    return 1;
  }
});
System.out.println(Arrays.toString(arr));

String str = "dd";
char chad = 'g';

System.out.println(str);
StringBuilder sb2 = new StringBuilder();

int [] arr3 = new int[]{4,5};
List <Integer> list = new LinkedList<>(List.of(arr3));
System.out.println(list);





  } // end of main
} // End of Main
