public class Playground {
  public static void main(String[] args) {
    int maxStar = 3;
    String word = "";
    for (int i = 0; i < maxStar ; i++) {
      word += "*";
      System.out.println(word);
    }
    for (int i = word.length() - 1; i > 0; i--) {
      System.out.println(word.substring(0, i));
    }

      
    
  
  } // end of main
} // End of Main
