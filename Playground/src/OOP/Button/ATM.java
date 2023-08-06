package Playground.src.OOP.Button;

public class ATM {
  private Button [] numsBtns;
  
  
  public void setNumsBtns(Button [] numsBtn){
    this.numsBtns = numsBtn;
  }

  public static void main(String[] args) {
    NumsBtn n = new NumsBtn("dfdsf", Color.BLUE, 45, 56);
    //System.out.println(n.no);
  }
}
