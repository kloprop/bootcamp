package B_zoo;

public class Zoo2  {
  
  Animal animal;
  //T count;

  private Zoo2(Animal animal){
    this.animal = animal;
  }

  // range of T
  public static  Zoo2 of(Animal animal){ // Java dont know what is the type
   return new Zoo2(animal);
  }

  public Animal getAnimal(String d){
    return this.animal;
  }

  public void setAnimal(Animal animal){
    this.animal = animal;
  }

  public static void main(String[] args){
    Zoo <Dog> zoo = Zoo.of(Dog.of("super"));
    //Zoo zoo3  = Zoo.of(Dog.of("super"));
    //Zoo zoo2  = Zoo.of(new Cat());
  }
}
