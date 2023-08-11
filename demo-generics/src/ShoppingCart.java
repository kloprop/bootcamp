import java.util.ArrayList;

public class ShoppingCart<T extends CheckoutItem> { // compile-time
  private ArrayList<T> items;


  public ShoppingCart() {
    this.items = new ArrayList<>();
  }

  public void add(int quantity,DisplayItem item) { // Shall ali gn with the bigger type
    CheckoutItem checkoutItem = new CheckoutItem(quantity, item.getPrice());
    items.add(item); //
  }

  public boolean remove(T food) {
    return this.items.remove(food);
  }

  public static void main(String[] args) {
    /*
     * ShoppingCart <Food> cart = new ShoppingCart<>(); cart.add(new Rice()); cart.add(new Noodle());
     */
    ShoppingCart<Item> cart = new ShoppingCart<>();
    ShoppingCart<Drink> cart2 = new ShoppingCart<>();
    ShoppingCart<Food> cart3 = new ShoppingCart<>();
    ShoppingCart<CheckoutItem> cart4 = new ShoppingCart<>();


  }
}
