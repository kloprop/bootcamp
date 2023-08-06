package FoodOrdering;

public abstract class Dish extends ShopItem {
  private Type type;
  private String name;
  private double prepareTime;

  public Dish(Type type, String name, double price, int itemNo, int qu,
      double time) {
    super(itemNo, price, qu);
    this.type = type;
    this.name = name;
  }

  public Type getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }



  public void setType(Type type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }



}
