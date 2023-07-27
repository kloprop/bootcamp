package Garden;

import java.util.Arrays;

public class TreesArea {
  private double area;
  private Oak [] ListOfOaks;
  private Maple [] ListOfMaples;

  //Constructors
  public TreesArea(double area, Oak [] ListOfOaks, Maple [] ListOfMaples){ 
    this.area = area;
    this.ListOfOaks = Arrays.copyOf(ListOfOaks,ListOfOaks.length);
    this.ListOfMaples = Arrays.copyOf(ListOfMaples,ListOfMaples.length);
  }

  public TreesArea(double area, int numOfOaks, int numOfMaples){
    this.area = area;
    this.ListOfOaks = new Oak[numOfOaks];
    for (int i = 0 ; i< this.ListOfOaks.length; i++){
      this.ListOfOaks[i] = new Oak(1.5);
    }

    this.ListOfMaples = new Maple[numOfMaples];
    for (int i = 0 ; i<this.ListOfMaples.length; i++){
      this.ListOfMaples[i] = new Maple(2.3);
    }
  }
  public TreesArea(double area, int numOfOaks,double heightOfOaks, int numOfMaples,double heightOfMaples){
    this.area = area;
    this.ListOfOaks = new Oak[numOfOaks];
    for (int i = 0 ; i< this.ListOfOaks.length; i++){
      this.ListOfOaks[i] = new Oak(heightOfOaks);
    }

    this.ListOfMaples = new Maple[numOfMaples];
    for (int i = 0 ; i<this.ListOfMaples.length; i++){
      this.ListOfMaples[i] = new Maple(heightOfMaples);
    }
  } 
  //Methods
  public double area(){
    return this.area;
  }

  public Oak [] getListOfOaks(){
    return this.ListOfOaks;
  }
  public Maple [] getListOfMaples(){
    return this.ListOfMaples;
  }
  public int totalPlants(){
    return this.ListOfMaples.length + this.ListOfOaks.length;
  }
  public void setArea(double area){
    this.area = area;
  }
  public double oaksPrice(){
    double total = 0;
    for (int i = 0 ; i < this.ListOfOaks.length; i++){
      total += this.ListOfOaks[i].getPrice();
    }
    return total;
  }
  public double maplesPrice(){
    double total = 0;
    for (int i = 0 ; i < this.ListOfMaples.length; i++){
      total += this.ListOfMaples[i].getPrice();
    }
    return total;
  }
  public double areaTotalPrice(){
    return this.oaksPrice() + this.maplesPrice();
  }

  public static void main(String [] args){
    TreesArea t = new TreesArea(123, 2, 3);
    System.out.println(t.getListOfOaks()[0].getId());
    System.out.println(t.getListOfOaks()[1].getId());
    System.out.println(t.getListOfMaples()[1].getId());
    System.out.println(t.oaksPrice());
    System.out.println(t.maplesPrice());
    System.out.println(t.totalPlants());

    TreesArea t2 = new TreesArea(1000, 2, 3, 2, 5);
    System.out.println(t2.getListOfOaks()[0].getId());
    System.out.println(t2.getListOfOaks()[1].getId());
    System.out.println(t2.getListOfMaples()[1].getId());
    System.out.println(t2.oaksPrice());
    System.out.println(t2.maplesPrice());
    System.out.println(t2.totalPlants());
    System.out.println(t2.area());
    Oak o = new Oak(5);
    Oak o2 = new Oak(4);
    Oak o3 = new Oak(3.3);
    Oak [] oaks = new Oak[]{o,o2,o3};
    Maple m = new Maple (4.6);
    Maple m2 = new Maple (3.6);
    Maple m3 = new Maple (8.6);
    Maple [] maples = new Maple[]{m,m2,m3};

    TreesArea t3 = new TreesArea(50.6, oaks, maples);
    System.out.println(t3.getListOfOaks()[0].getId());
    System.out.println(t3.getListOfOaks()[1].getId());
    System.out.println(t3.getListOfMaples()[1].getId());
    System.out.println(t3.oaksPrice());
    System.out.println(t3.maplesPrice());
    System.out.println(t3.totalPlants());
    System.out.println(t3.area());
    System.out.println(t3.getListOfOaks()[2].getHeight());
    System.out.println(t3.getListOfOaks()[1].getHeight());
    System.out.println(t3.getListOfMaples()[0].getHeight());
  }

  

} //End of Class
