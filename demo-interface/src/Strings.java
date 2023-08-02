public class Strings implements CharSequence {

  char[] arr;

  private Strings(String str) {
    //arr = new char[str.length()];
    arr = str.toCharArray();

  }

  public Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int ind) {
    return this.arr[ind];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    // return String , StringBuilder, StringBuffer
    if (end < start || start < 0 || end < 0 || start > this.arr.length - 1
        || end > this.arr.length) {
      return String.valueOf(this.arr);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) {
      sb.append(this.arr[i]);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Strings s = new Strings("abc");
    System.out.println(s.subSequence(1, 3));
  }
}
