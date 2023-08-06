package VPN;


public class Premium extends Vpn{
  public Premium (){
    super(200, false , false, Plan.STARTER);
    buildNetwork();
  }

  public void buildNetwork(){
    System.out.println("Network is built with C");
  }
}
