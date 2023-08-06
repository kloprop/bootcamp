package Playground.src.OOP.Button;

public class FunctionalBtn extends Button {
  
  public FunctionalBtn(String name, Color color, double width, double height){
    super(name,color,width,height);
  }

  public void onClick(){
    System.out.println(this.getName());
  }
}
