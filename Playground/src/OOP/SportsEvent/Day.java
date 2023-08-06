package OOPDaily.SportsEvent;

public enum Day {
  MONDAY(1),
  TUESDAY(2),
  ;

  private int id;
  private Day(int id){
    this.id = id;
  }

  public int getId(){
    return this.id;
  }
  
}
