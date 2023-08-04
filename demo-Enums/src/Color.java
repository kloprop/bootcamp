public enum Color {
  RED("#FF0000"),
  GREEN("#00FF00"),
  BLUE("#0000FF"),
  ;
  private String hexCode;
  static int count = 0;

   Color (String hexCode){
    this.hexCode = hexCode;
    count++;
  }

  public String getHexCode(){
    return this.hexCode;
  }
}
