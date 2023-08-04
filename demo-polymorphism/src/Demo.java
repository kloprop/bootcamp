import Fly.Helicopter;

public class Demo {
    public static void main(String[] args) {
        // Dynamic Polymorphism (Run-time)
        Building building = new House();
        Family f = new Family();
        //House h = (House) f;
        if (f instanceof House){
            House h2 = (House) f;
            System.out.println("yo");
            h2.live();
        }
        // Compile-time checks
        // building.getCapacity(); compile error
        // building.print(); compile error if Building dun have
        building.print(); // Compile time confirm you can call print() method
        // Run-time decide which print() is going to call
        // Building variable call House's print() method
        building.print2(); // House //this is overriden // call House's print2

        House house = new House();
        house.print("p");
        house.print();
;
        long l1 = Long.valueOf(1L);
        // downcast (Run-time Polymorphism)
        // Cube -> Container

       
        Container obj = new Cube(); //Upcast


        if (obj instanceof Cube) { // is cube or sth extends cube //upcast may happen if subclass if cube is passed in
            System.out.println("hi");
            Cube cube = (Cube) obj;
        }// downcast: Object -> Cube */

        Object obj2 = new Container(); //hiding
        if (obj2 instanceof Container) { // obj hv container to unhide?
            Container container = (Container)obj2;  //unhide container
            System.out.println("object to container");
        }

    }
}
