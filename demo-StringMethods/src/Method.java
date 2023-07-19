public class Method {
  public static void main (String [] args){
    //length(),equals(),charAt()

    // isEmpty (length = 0) 
    String str = "null";
    String str2 = "";
    System.out.println(str.isEmpty());
    System.out.println(str2.isEmpty());

    // isBlank() (no words, spaces are not counted)
    String str3 = " ";
    System.out.println(str2.isBlank());
    System.out.println(str3.isBlank()); 

    // toLowerCase(), toUpperCase()
    System.out.println(str.toLowerCase());
    
    // substring(beg,end)begInd is inclusive, endInd is exclusive
    // hello -> he
    System.out.println(str.substring(0,2));
    System.out.println(str.substring(0,str.length()));
    System.out.println(str.substring(0));

    //contains() accepts string and the sequence matters
    String s = "lo";
    System.out.println(s.contains("lo"));

    str = str.toUpperCase(); //reassign the modified string

  } //end of main
} //End of Main
