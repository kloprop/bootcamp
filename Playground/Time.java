package Playground;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
  public static void main(String[] args) {
    
    // Local Time
    LocalTime time = LocalTime.now();
    LocalTime time1 = LocalTime.of(12,45);
    System.out.println(time1);

    LocalTime ti = time1.minusHours(13);
    System.out.println(ti);
    System.out.println(ti.compareTo(time1));
    System.out.println(LocalTime.parse("05:03:45"));

    DateTimeFormatter format = DateTimeFormatter.ofPattern("H:   mm");
    System.out.println(ti.format(format));
  }

  
}
