public class Method2 {
  public static void main(String[] args) {


    // trim()
    // remove the spaces at the begining and end
    String str = "Hello  ";
    String str2 = "  He   l  lo   ";
    System.out.println("str.trim()= " + str2.trim());

    // startsWith()
    // check if the string start with the target string

    if (str.startsWith("He")) {
      System.out.println("It start with ");
    }

      // endsWith()
      // check if the string ends with the target string

      boolean endsWithSpace = str.endsWith(" ");
      if (endsWithSpace) {
        System.out.println("It ends with");
      }

      // indexOf (char)
      // return the index of target ele, return -1 if not found

      System.out.println(str.indexOf('o'));
      // indexOf (String)
      System.out.println(str.indexOf("He"));
      System.out.println(str.indexOf("eH")); // -1
      System.out.println(str.indexOf("o",5)); //-1 (inclusive)

      //lastIndexOf
      String str3 = "hello";
      System.out.println(str.lastIndexOf("l"));
      System.out.println(str.lastIndexOf('l', 2));

      //replace
      String s = "Java is a programming language p";
      System.out.println(s.replace('p', 'q'));

      //equals(), equalsIgnoreCase()
      if ("Hello".equals(str3)){
        System.out.println("It is equal");
      }
      if ("Hello".equalsIgnoreCase(str3)){
        System.out.println("It is equal!");
      }

      //concat (String), append something

      String newString = str3.concat("java");
      System.out.println(newString);
      str3 = str.concat("java");
      System.out.println(str3);

      //compareTo

      String apple = "apple";
      String facebook = "facebook";
      System.out.println(apple.compareTo(facebook));

  } // End of Main
} // End of Class
