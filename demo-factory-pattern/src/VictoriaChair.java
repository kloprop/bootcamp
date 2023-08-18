

public class VictoriaChair implements Chair {

  private int leg;
  private Style style = Style.VICTORIA;

  @Override
  public boolean hasLegs() {
    return this.leg>0;
  }
  @Override
  public void sitOn(){

  }

}
