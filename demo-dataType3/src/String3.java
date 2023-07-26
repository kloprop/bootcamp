public class String3 {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        System.out.println(str.equals(str2)); // checking content
        System.out.println(str == str2); // chekcing address

        //String Literal Pool -> "abc" // unlinked string would not be deleted as quick as heap
        String str3 = "abcd";
        System.out.println(str3 == str); // their addresses are not the same

        str = "abc123"; // create new obj and str pointes to the new obj (immutable)

        Integer a = 20;
        a = a +20; // left a refer reference, right a value of copy
        // a = 30



        String s1 = new String ("j"); //store in place in heap, but not the pool
        String s = "j"; // store in pool
  
       System.out.println("op"+(s == s1));
        
        System.out.println("s1"+ (s == "j")); //false, "j" refers to s reference,

        Integer i3 = 128; // new obj // store in place in heap , but not cache
        Integer i4 = 128; // new obj

        int [] arr = new int []{2,3,4};

        
        s = null; // remove reference
        arr = null;
        i4 = null;

    
        char [] arr3 = new char [] {'c', 'd','c'};
        System.out.println(String.valueOf(arr3));

        boolean [] arr4 = new boolean[] {true, false, true};
        StringBuilder sb2 = new StringBuilder();
       
        StringBuilder sb1 = new StringBuilder();
        for (boolean b : arr4){
            sb1.append(b);
        }
        System.out.println(sb1);


        


    }
}
