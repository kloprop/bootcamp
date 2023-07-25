public class App {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello"); // Constructor
        s.append("World");
        System.out.println(s); // it would print if it is appended
        System.out.println(s.toString()); // Turn string builder to string
        s.append(56);
        System.out.println(s.toString());
        s.append(true).append(4000L).length();
        System.out.println(s.length());

        String str = "  He llo";
        String [] strs = str.trim().replace('H', 'e').split(" ");
        StringBuilder str2 = new StringBuilder();
        str2.append(2).append("3").append('e').append(3).append("sdf");
        System.out.println(str2.toString());

        StringBuilder s2 = new StringBuilder("start");
        System.out.println(s2.append(2).toString().charAt(3));

        // insert 
        StringBuilder s3 = new StringBuilder("Hello");
        s3.insert(3,' ');
        System.out.println(s3);

        s3.insert(0, "World").append("World");
        System.out.println(s3);

        // delete
        s3.deleteCharAt(3);
        System.out.println(s3.toString());

        // replace by using index
        s3.setCharAt(4, 'j');

        String num = "3.3";
        System.out.println(Double.valueOf(num));
        
        StringBuilder sb = new StringBuilder("Start");
        
       

    }
}
