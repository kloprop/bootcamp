package Airport;

import java.util.Arrays;

public class Airport {
  private String name;
  private String location;
  private int totalParkingSpace;
  private Aircraft [] parkingCrafts;
  private String trafficStatus;

  public Airport (String name,String location, int parkingSpace){
    this.name = name;
    this.location = location;
    this.totalParkingSpace = parkingSpace;
    this.parkingCrafts = new Aircraft[parkingSpace];
    this.trafficStatus = null;
  }

  public String getName (){
    return this.name;
  }
  public String getLocation(){
    return this.location;
  }
  public int getTotalParkingSpace(){
    return this.totalParkingSpace;
  } 
  public Aircraft [] getParkingCrafts(){
    return this.parkingCrafts;
  }
  public String getTrafficStatus(){
    int noOfCrafts = 0; 
    for (Aircraft craft : this.parkingCrafts){
      if (craft != null)
        noOfCrafts++;
    }
    if (noOfCrafts <= totalParkingSpace*0.3)
      this.trafficStatus = "Light";
    
    else if (noOfCrafts <= totalParkingSpace*0.5)
      this.trafficStatus =  "Normal";
    else if (noOfCrafts <= totalParkingSpace*0.8){
      this.trafficStatus = "Busy";
    }
    else{
      this.trafficStatus = "Congested";
    }
    return this.trafficStatus;
  }

  public void setName (String name){
    this.name = name;
  }
  public void setLocation(String location){
    this.location = location;
  }
  public void setTotalParkingSpace (int num){
    this.totalParkingSpace = num;
  }

  public int getParkingSpace(){
    for (int i = 0 ; i < parkingCrafts.length; i++){
      if (parkingCrafts[i] == null){
        return i;
      }
    }
    return -1;
  }
  public void parkAirCrafts(Aircraft aircraft){
    int index = this.getParkingSpace();
    if (index == -1){
      System.out.println("Please wait for a while, the spaces are full!");
      return;
    }
    this.parkingCrafts[index] = aircraft;
    System.out.printf("%s is parked in %d !",aircraft.getModel(),index);
    System.out.println();
  }


  public static void main(String [] args){
    Airport port1 = new Airport("Hong Kong International Airport", "Hong Kong", 120);

    Aircraft plane = new Aircraft("SGH-03",400000,"03-03-2003",2013);
    plane.setYearOfLastCheck(2016);
    System.out.println(plane.isCheckExpired());

    Aircraft plane2 = new Aircraft("SGH-04",500000,"03-03-2002",2012);
    plane2.setYearOfLastCheck(2012);
    System.out.println(plane2.isCheckExpired());

    Aircraft plane3 = new Aircraft("SGH-05",600000,"03-03-2007",2018);
    plane3.setYearOfLastCheck(2019);
    System.out.println(plane3.isCheckExpired());

    Aircraft plane4 = new Aircraft("SGH-06",700000,"03-03-2009",2020);
    plane4.setYearOfLastCheck(2022);
    System.out.println(plane4.isCheckExpired());

    port1.parkAirCrafts(plane);
    port1.parkAirCrafts(plane2);
    port1.parkAirCrafts(plane3);
    port1.parkAirCrafts(plane4);

    System.out.println(port1.getTrafficStatus());
  } // End of Main
} // End of Class

