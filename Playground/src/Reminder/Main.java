package Reminder;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Schedule re = Schedule.of("Ken");
    System.out.println(re.getOwner());

    System.out.println(re.check());
    System.out.println(Arrays.toString(re.getEvent()));
    re.add("Outdoor", 23, 02, 2018);
    re.add("Movie day", 23, 02, 2021);
    System.out.println(Arrays.toString(re.getEvent()));
    
    
  

  }
}
