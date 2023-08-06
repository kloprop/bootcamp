package VPN;


public class VPNFactory {
  public static Vpn selectVpn(Plan plan){
    if (Plan.STARTER.equals(plan)){
      return new Starter();
    }
    if (Plan.STANDARD.equals(plan)){
      return new Standard();
    }
    if (Plan.PREMIUM.equals(plan)){
      return new Premium();
    }
    return null;

  }
  public static void main(String[] args) {
    Vpn v = VPNFactory.selectVpn(Plan.STARTER);
    v.connect();

  }
}
