/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {

    if (s.equals(goal)){ // since the method would not include the case of original case
      return true;
    }
    if (goal.length() != s.length()){
      return false;
    }
    
    for (int i = 0 ; i < s.length()-1; i++){ // 
      StringBuilder str = new StringBuilder(s.substring(i+1,s.length())); // string that does not shift
      str.append(s.substring(0, i+1)); // string that shift
      System.out.println(str.toString());
      if (str.toString().equals(goal)){
        return true;
      }
    }
    return false; 

    // abcdeabcde -> must contain goal if it is true;
    /* return (s.length() == goal.length())&& (s.concat(goal).contains(goal)); */

    }
}
