package VPN;

public abstract class Vpn {
  private double speed;
  private Boolean passwordControl;
  private Boolean cloudStorage;
  private Plan plan;

  public abstract void buildNetwork();

  public Vpn(double speed,Boolean control,Boolean storage,Plan plan){
    this.speed = speed;
    this.passwordControl = control;
    this.cloudStorage = storage;
    this.plan = plan;

  }
  public void connect(){
    System.out.println("Connecting with "+ this.speed+" ms");
  }
}
