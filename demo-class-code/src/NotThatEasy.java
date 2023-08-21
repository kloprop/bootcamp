import java.util.ArrayList;
import java.util.List;

public class NotThatEasy {
    
    static final List <Character> characters = method();
    private static final char[] chars = {'J', 'a', 'c', 'k', 'y'};
    final int x = method2();

    static {
        System.out.println("I am static code block");
        //characters = new ArrayList<>();
    }
    static List<Character> method(){
        System.out.println("I am static method");
        return new ArrayList<>();
    }
    static int method2(){
        System.out.println("I am static, called by instance variable");
        return 1;
    }
    {
        // object itialization code block
        // called when the object is created
        System.out.println("I am initialzation");
    }
    
    public static void main(String[] args) {
        // Once you click the run button:
        // 1. compile
        // 2. Run -> class loader -> stack memory
        System.out.println("Start of main");
        
        
        NotThatEasy n = new NotThatEasy();
        
        
    }
}
