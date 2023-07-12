public class Operator {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        /* System.out.println(a+b); //15 */

        int x = 1;
        x = x + 1; // 2
        x++; // 2
        ++x; // 2
        x += 1; // 2

        System.out.println("x=" + x); // 5

        // Others (-*/) is the same

        int integer = 12 % 5; // 2
        int integer2 = 12;
        integer2 %= 5; // 2

        // ++,--
        int m = 3;
        /*
         * m++; int preIncrement = ++m; // ++first or assignment first? +first and assign int postIncrement = m++; // ++first or assignment first?
         */

        m = m++;

        System.out.println(m);

        // Operators Precedence
        int result13 = (1 + 9) * 3;
        int result14 = result13++ + 1;
        System.out.println(result14);
        System.out.println(result13);

        int x1 = 5;
        System.out.println((x1++ + 2) * (x1++ + 2)); // 7*8



    } // end of main
} // End of Main
