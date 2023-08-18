
public class DemoRecord {
    

    public static void main(String[] args) throws Exception {
        Person10 person = new Person10("John", 30);
        Person11 person1 = new Person11("John", 30);
        Person11 person2 = new Person11("John", 30);

        System.out.println(person1.equals(person2));


        person.setAge(10);
        

        


    }
}
