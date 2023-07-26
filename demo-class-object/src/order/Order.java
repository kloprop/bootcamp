package order;
import java.util.Arrays;

public class Order {
  private Transaction [] transactions; // no empty constructor for arr



  public Order (Transaction [] arr){
    this.transactions = Arrays.copyOf(arr,arr.length);
  }
  // getTotal
  public double getTotal(){
    double sum = 0;
    for (Transaction transaction : this.transactions){
      sum+= transaction.getSubTotal();
    }
    return sum;

  }
}
