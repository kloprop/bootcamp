package Playground.src.OOP.Button;

public class NumsBtn extends Button{

  public NumsBtn(String name, Color color, double width, double height){
    super(name,color,width,height);
    if (Integer.valueOf(name) > 10 || Integer.valueOf(name) < 0 ){
      return;
    }

  }
  public void onClick(){
    System.out.println(this.getName());
  }

  public int toInt(){
    return Integer.valueOf(this.getName());
  }
}
