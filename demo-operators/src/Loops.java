public class Loops {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 3) {
        continue;
      }
      if (i == 7) {
        break;
      }
      System.out.println(i);

      // check for condition, run the block, update i
    }

    for (int j = 6; j > 0; j--) {
      System.out.println("j =" + j);
    }


    int sum = 0;
    int sumWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
      if (i % 2 != 0 && i != 5) {
        sumWithout5 += i;
      }
    }
    System.out.println(sum);
    System.out.println(sumWithout5);

    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
      if (i > 2) {
        break;
      }
    }

    for (int i = 0; i < 6; i++) {
      System.out.println("Hello");
      if (i > 3) {
        continue;
      }
      System.out.println("Bye!");
    }

    /*
     * // Nested loop for (int i = 0; i < 4; i++) { for (int j = 0; j < 3; i++) { System.out.println("Hello"); } } // When i is 0 , j loop from 0 to 2
     */
    for (int i = 0; i < 5; i++) {
      String message = "";
      for (int j = 0; j <= i; j++) {
        message += "*";
      }
      System.out.println(message);

    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("l");
    System.out.print("g");
    System.out.println(" p");
    System.out.println();


    /*
     * for (int i = 0; i < 6; i++) { for (int j = 0; j < 3; j++) { if (i == j) { break; // break would exit the loop while continue just skip the case, the loop continues } System.out.println("i= " + i +
     * "j= " + j); } } for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { if (i == j) { continue; } System.out.println("i=" + i + "j= " + j); } }
     */

    String str = "I love programming. I love Java.";
    System.out.println("str's length\n" + str.length());

/*     for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        System.out.println(i);
        break;
      }
    } */
   /*  Boolean isFound = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        isFound = true;
        break;
      }
      
    }
    if (isFound){
      System.out.println("Found");
    }
    else{
      System.out.println("Not found");
    }; */

    char target = 'o';
    int count = 0;
    boolean isGreaterThan3 = false;

    for (int i = 0; i<str.length();i++){
      if (target == 'o'){
        count+=1;
      }
      if (count>=3){
        isGreaterThan3 = true;
        break;
      }
    }
    if (isGreaterThan3){
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }

    String str2 = "Hello";
    String newStr ="";
    for (int i = str2.length()-1;i>=0;i--){
      newStr+=str2.charAt(i);
    }
    System.out.println(newStr);
  


  } // end of main
} // End of Main
