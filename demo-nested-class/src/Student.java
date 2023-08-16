import java.util.List;

public class Student {
    private String name;
    // constructor

    Bag bag;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
        bag = new Student.Bag();
    }
    // getter, setter, static method & variable

    // method -> Bag.method, instance variable
    public int getSize() {
        return this.bag.size;
    }

    public void clearBag() {
        Bag.clear(this.bag);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Student[name=" + this.name + "," + this.bag + "]" + "]";
    }

    // Static nested class
    // can not access outer Class Attribure
    private static class Bag {
        int size;
        List<String> strings;

        public int getSize() {

            return this.size;
        }

        // Constructor
        // getter, setter
        // static method & varibale
        public static void clear(Bag bag) {
            
            bag.strings.clear();

        }

        @Override
        public String toString() {
            return "Bag[size =" + this.size + ", strings =[" + "]";
        }

    }


    // Inner class (non-static nested class) inner can get outer class info

    public class Grade { // Must be public for creating , why exist then?
        private  int score;

        public Grade(int score) {
            this.score = score;
        }

        public char getGrade() {
            switch (this.score) {
                case 90:
                    return 'A';
                case 80:
                    return 'B';
                case 70:
                    return 'C';
                case 60:
                    return 'D';
                default:
                    return 'F';
            }
        }

        public void printStudentName() {
            System.out.println(name);
        }


    }

    public static void main(String[] args) {
        Student student = new Student("John");
        Student.Bag bag = new Student.Bag();
        
        Student.Grade grade = student.new Grade(90);
        grade.printStudentName();


    
    }

}
