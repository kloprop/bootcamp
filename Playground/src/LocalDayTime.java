import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDayTime {
  public static void main(String [] args){
    //LocalDayTime time = LocalDayTime.now();
    LocalDateTime time = LocalDateTime.of(2002, 1, 23,12,45,23);
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  

    System.out.println(time.format(format1));
  }
}
