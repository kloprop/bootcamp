public class Conditional {
  public static void main(String[] args) {

    // if, else if, else
    int i = 10;
    if (i > 9) {
      System.out.println("i=" + i);
    }
    if (i > 8) {
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is 9");
    }

    // else-if
    if (i > 12) {
      System.out.println("A");
    } else if (i <= 12 && i >= 0) {
      System.out.println("B");
    } else {
      System.out.println("C");
    }

    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    }
    System.out.println("The box is " + box);
    // Example 1
    int number = 11;
    if (number % 2 == 1) {
      System.out.println("This is an odd number");
    } else {
      System.out.println("This is an even number");
    }

    // Example 2
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("Today is Monday");
    }
    if (str.charAt(4) == 'd') {
      System.out.println("yes");
    }
    if (str.length() > 10) {
      System.out.println("length>10");
    }
    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("it is a yes");
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'E';
    }


    int age = 65;
    boolean isElderly = age >= 65;

    if (isElderly) {
      System.out.println("Hello world");
    }



    // Switch
    // Simple Version
    int dayOfWeek = 3;
    String dayName = "";
    switch (dayOfWeek) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;

    }
    System.out.println(dayName);

  } // end of main


}// End of Main
