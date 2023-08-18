

public class ModernChair implements Chair {

  private int leg;
  private Style style = Style.MODERN;

  @Override
  public boolean hasLegs() {
    return this.leg>0;
  }
  @Override
  public void sitOn(){

  }

}
