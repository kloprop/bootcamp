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

  } // end of main
} // End of Main
