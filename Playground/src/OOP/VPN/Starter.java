package VPN;


public class Starter extends Vpn {
  /* private static final double speed = 200;
  private Boolean passwordControl = false;
  private Boolean cloudStorage = false;
  private Plan plan = Plan.STARTER; */
  public Starter (){
    super(200, false , false, Plan.STARTER);
    buildNetwork();
  }

  public void buildNetwork(){
    System.out.println("Network is built with A");
  }
}
