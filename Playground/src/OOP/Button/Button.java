package Playground.src.OOP.Button;

public abstract class Button implements Clickable{
  private String name;
  private Color color;
  private double width;
  private double height;
  public static boolean no = true;
  private boolean yes;

  static{
    no = false;
  }

  public Button(String name, Color color, double width, double height){
    this.name = name;
    this.color = color;
    this.width = width;
    this.height = height;
  }

  public String getName(){
    return this.name;
  }

  
}
