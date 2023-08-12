import java.util.ArrayList;
import java.util.List;
import B_zoo.Animal;
import B_zoo.Dog;
import B_zoo.Zoo;

public class DemoGeneric {
    public static void main(String[] args){
        List <String> list = new ArrayList<>();
       
        // Animal Example
        Zoo<Dog> zoo1 = Zoo.of(Dog.of("op"));
        zoo1.setAnimal(Dog.of("abc"));

        Zoo<Animal> zoo2 = Zoo.of(Dog.of("opo"));
        zoo2.setAnimal(new Animal());
        zoo2.setAnimal(Dog.of("dfg"));

    }
}
