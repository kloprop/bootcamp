package A_unchecked;
public class Demo_ArithmeticException {
    public static void main(String[] args) {
        int i = 0; 
        int n = 100;
        int result;
        try{
            result = n/i;
        }catch(ArithmeticException e){
            result = 0;
        }
        System.out.println(result);
    }
}
