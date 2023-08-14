package H_person;

import java.util.List;

public interface Swimable2<T> {
  void swim();
  //public static void start (List<Swimable> humans){
 // public static <T extends Swimable> void start(List<T> humans){
  static void start(List<? extends Swimable > humans){

    for (Swimable human: humans){
      human.swim();
    }

  }
  void print(T value);
  
}
