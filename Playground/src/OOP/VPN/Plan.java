package VPN;

public enum Plan {
  STARTER (2300), //price
  STANDARD (3300),
  PREMIUM(4300),
  ;

  private int price;

  private Plan(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
}
