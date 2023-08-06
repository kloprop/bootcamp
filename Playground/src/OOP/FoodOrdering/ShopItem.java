package FoodOrdering;

public abstract class ShopItem {

  private int itemNo;
  private double price;
  private int orderQuantity;
  private int stock;

  public ShopItem (int itemNo, double price, int qu){
    this.orderQuantity = qu;
    this.itemNo = itemNo;
    this.price = price;
  }

  public int getItemNo(){
    return this.itemNo;
  }

  public double getPrice() {
    return price;
  }
  public int getStock(){
    return this.stock;
  }
  public int getOrderQuantity(){
    return this.orderQuantity;
  }

  public void setItemNo(int itemNo){
    this.itemNo = itemNo;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setStock(int stock){
    this.stock = stock;
  }
  public void setOrderQuantity(int qu){
    this.orderQuantity = qu;
  }
  public boolean isOutOfStock(int qu){
    return this.stock < qu;
  }
  public void sell(int n){
    this.stock-=n;
  }
  public void restock(int n){
    this.stock += n;
  }

  
}
