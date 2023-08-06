package VPN;


public class Standard extends Vpn {
  public Standard (){
    super(200, false , false, Plan.STARTER);
    buildNetwork();
  }

  public void buildNetwork(){
    System.out.println("Network is built with B");
  }
}
