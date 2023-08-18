


public class Demo {
    public static void main(String[] args) throws Exception {

        Weekday1 weekday = Weekday1.TUE;
        // Approahch 1 
        int result = switch(weekday){
            case MON,TUE -> 1;
            case WED -> 1;
            case THURS -> 1;
            case FRI -> 1;
        };
        // Approahch 2
        int result2 = switch(weekday){
            case MON,TUE: 
                System.out.println("Monday or Tuesday");
                yield 1;
            case WED,THURS: 
                System.out.println("Monday or Tuesday");
                yield 2;
            case FRI: 
                System.out.println("Monday or Tuesday");
                yield 3;
            
            
        };

        String str = "Hello World";
        String result2 = switch(str){
            case String str.length() >5 -> "length >5";
            case String str.contains("world") -> "contains world";
            default -> "Unknown";
        }
    }
    public static int getDayNumber (Weekday1 Weekday){
        switch(Weekday){
            case MON:
                return 1;
            case TUE:
                return 2;
            case WED:
                return 3;
            case THURS:
                return 4;
            case FRI:
                return 5;
            default:
                return 0;
        }
    }
    public static char grade(int score){
        char grade = ' ';
        switch (score){
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            default:
                grade = 'F';
                break;
        }
        return grade;
    }
}
