package Playground;

public class Test4    {
  public static int num = 1;

  public  Test4(){
    num++;
  }
  public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("j");

    sb.insert(2, 'd');
    System.out.println(sb);
  }
}
