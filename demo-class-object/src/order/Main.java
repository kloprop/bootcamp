package order;

public class Main {
  public static void main(String[] args) {
    ItemDesc itemDesc1 = new ItemDesc("Item A", "90% discount");
    ItemDesc itemDesc2 = new ItemDesc("Item B", "80% discount");
    Transaction t = new Transaction(1, itemDesc1, 3, 10.5);
    System.out.println("Sub total:"+t.getSubTotal());
    Transaction t2 = new Transaction(1, itemDesc2, 3, 10.5);
    Order order = new Order(new Transaction[]{t,t2});
  }

}
