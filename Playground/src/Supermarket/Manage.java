package Supermarket;

public class Manage {

  private Staff [] staffs = new Staff[3];

  public Staff[] getStaffs(){
    return this.staffs;
  }

  public void addStaff(int ind,Staff staff){
    this.staffs[ind] = staff;
  }

  


  public void saleryAdjustBasedOnPerformance(){
    for (Staff staff:this.staffs){
      int adjustAmount = 0;
      if (staff.getPerformance() <= 50){
        adjustAmount = 1000;
      }
      else if (staff.getPerformance() <= 70){
        adjustAmount = -500;
      }
      else if (staff.getPerformance() >100){
        adjustAmount= 1000;
      }
      staff.adjustSalery(adjustAmount);

      System.out.println("The adjustment of "+ staff.getName()+ " is " +adjustAmount);
      System.out.println("The new salery is " + staff.getSalery());
      System.out.println();
      

    }
  }




  public static void main (String [] args){
    
    Staff peter = new Staff("Peter", "Manager", 30000, "0900 - 1800");
    Staff betty = new Staff("Betty", "Assisant", 25000, "0900 - 1800");
    Staff john = new Staff("John", "Assisant", 23000, "0800 - 1700");

    peter.adjustPerformance(50);
    betty.adjustPerformance(70);
    john.adjustPerformance(200);

    
    Manage m = new Manage();
    m.staffs[0] = peter;
    m.staffs[1] = betty;
    m.staffs[2] = john;
    m.saleryAdjustBasedOnPerformance();
  } // End of Main


} // End of Class
