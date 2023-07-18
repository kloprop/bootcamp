import java.util.Arrays;

public class Invoice {
  public static void main (String [] args){
    int [] quantities = new int [] {5,10,4,7,20};
    double [] unitPrices = new double [] {2,3,4,6.4,45.3};

    
    double [] itemsTotalPrice = new double[quantities.length]; //create invoice
    
    for (int i = 0 ; i<itemsTotalPrice.length; i++){
      itemsTotalPrice[i] = totalPrice(quantities[i],unitPrices[i]); // update all items's price into a invoice
    }

    System.out.println("Your invoice: " +Arrays.toString(itemsTotalPrice));

    double invoiceTotalAmount = getInvoiceAmount(itemsTotalPrice); // calculate the invoice
    System.out.println("Total amount: "+ invoiceTotalAmount);
  } // end of main


  public static double totalPrice(int quantities,double unitPrices){
    if (quantities < 0 || unitPrices < 0){
      return 0;
    }
    return quantities*unitPrices;
  }
 
  public static double getInvoiceAmount(double [] itemsTotalPrice){
    double sum = 0; 
    for (int i = 0; i<itemsTotalPrice.length;i++){
      sum+= itemsTotalPrice[i];
    }
    return sum;
  }
} // End of Class
