package B_zoo;
public class Zoo <T extends Animal> {
  
  T animal;
  //T count;

  private Zoo(T animal){
    this.animal = animal;
  }

  // range of T
  public static <T extends Animal> Zoo<T> of(T animal){ // Java dont know what is the type
   return new Zoo<>(animal);
  }


  public T getAnimal(String d){
    return this.animal;
  }

  public void setAnimal(T animal){
    this.animal = animal;
  }

  public static void main(String[] args){
    Zoo <Dog> zoo = Zoo.of(Dog.of("super"));
    //Zoo zoo3  = Zoo.of(Dog.of("super"));
    //Zoo zoo2  = Zoo.of(new Cat());
  }
}
