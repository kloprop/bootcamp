package G_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalMap<T> {
  Map<T,String> map;

  public AnimalMap(){
    map = new HashMap<>();
  }

  public void put(T key,String animal){
    map.put(key, animal);
  }

  public String get(T key){
    return map.get(key);
  }


  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap<>();
    List <Animal> list = new ArrayList<>(); 
    // Must be List <Animal> list = new AnimalMap<Animal>();
    list.add(new Animal());
    list.add(new Dog());
    //List <? extends Animal> list2 = new ArrayList<Animal>();
    // Maybe List <Animal> list = new AnimalMap<Animal> , new AnimalMap<Dog>, new AnimalMap<Cat>
    //list2.add(new Animal()); //Compile-error
  }
  
}
