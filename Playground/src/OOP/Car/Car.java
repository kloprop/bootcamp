package OOP.Car;

public class Car {
  private Engine engine = new Engine();
  private Model model;
  private double price;
  private Color color;

  public Model getModel() {
    return this.model;
  }

  public double getPrice() {
    return this.price;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public String toString() {
    return String.format("Car:[Model : %s , price : %,.2f, Color : %s Engine :%s] %n",
        this.model, this.price, this.color, this.engine);
  }
  public Car (){
    
  }

  private Car(Builder builder) {
    this.model = builder.model;
    this.price = builder.price;
    this.color = builder.color;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Model model;
    private double price;
    private Color color;

    public Builder model(Model model) {
      this.model = model;
      return this;
    }

    public Builder price(double price) {
      this.price = price;
      return this;
    }

    public Builder color(Color color) {
      this.color = color;
      return this;
    }

    public Car build() {
      return new Car(this);
    }

  }
}
