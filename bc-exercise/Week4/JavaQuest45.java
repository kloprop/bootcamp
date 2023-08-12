
/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c")); //true 
    System.out.println(backspaceCompare("ab##", "c#d#")); // true
    System.out.println(backspaceCompare("a#c", "b")); //false
    System.out.println(backspaceCompare("", "f##")); // true
    System.out.println(backspaceCompare("######", "dddddd#####")); // false
    System.out.println(backspaceCompare("######", "######")); // true
    

  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
    return type(s)!= null && type(s).equals(type(t));
  }
  public static String type(String str){
    StringBuilder sb = new StringBuilder();
    for (int i = 0 ; i<str.length(); i++){
      char curr = str.charAt(i);
      if (curr == '#' && sb.length() == 0){
        continue;}
      else if (curr == '#' && sb.length() !=0 ){
        sb = new StringBuilder(sb.substring(0, sb.length()-1));
      }
      else{
        sb.append(curr);
      }
    }
    return sb.toString();
  }

}
