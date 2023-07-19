public class Array2 {
  public static void main(String[] args) {
    System.out.println(swap(null, 0, 2));
  } // End of Main

  public static String swap(String str, int ind1, int ind2) {
    if (str == null) {
      return null;
    }
    if (str.isBlank()) {
      return str;
    }
    if (ind1 < 0 || ind1 >= str.length() || ind2 < 0 || ind2 >= str.length()) {
      return str;
    }
    char[] arr = str.toCharArray();
    char temp = arr[ind1];
    arr[ind1] = arr[ind2];
    arr[ind2] = temp;
    return String.valueOf(arr);
  }
} // End of Class
