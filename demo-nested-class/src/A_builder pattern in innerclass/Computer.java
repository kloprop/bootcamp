public class Computer {
  private int weight;
  private String model;
  private Color color;
  
  private Computer(Builder builder){
    this.weight = builder.weight;
    this.model = builder.model;
    this.color = builder.color;
  }
  public static Builder Builder(){
    return new Builder();
  }

  
  public static class Builder{

  private int weight;
  private String model;
  private Color color;

  public Builder weight(int weight){
    this.weight = weight;
    return this;
  }
  public Builder model(String model){
    this.model = model;
    return this;
  }
  public Builder color(Color color){
    this.color = color;
    return this;
  }
  public Computer build(){
    return new Computer(this);
  }

  }
}
