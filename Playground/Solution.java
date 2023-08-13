package Playground;

class Solution {
  public static void main(String[] args) {
    System.out.println(toLowerCase("HELLO"));
  }
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
          char chars = (char) (c+32);
            sb.append(chars);
        }
        return sb.toString();
    }
}
