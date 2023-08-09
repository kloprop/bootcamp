public class DemoRecursion {
  public static void main(String[] args) {

    System.out.println(sum(3));
    System.out.println(sum2(4));
    print(3);
  }

  // Question 1:
  public static int sum(int k) {
    if (k == 0) {
      return 0;
    } else {
      return k + sum(k - 1);
    }
  }

  // Question 2:
  // 0,1,1,2,3,5,8,13
  public static int sum2(int k) {
    if (k == 0){
      return 0;
    }
    if (k == 1){
      return 1;
    }else{
      return sum2(k-1) + sum2(k-2);
    }

    // 0 + 1
    // 1
  }

  //Question 3 :
  // 3,2,1,1,2,3

  public static void print(int n){
    if (n<1){
      return;
    }
    System.out.print(n+" ");
    print(n-1);
    System.out.print(n+" ");
  }
}
