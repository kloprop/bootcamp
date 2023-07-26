public class StringBox {
  private String string;


  public StringBox(){

  }
  public StringBox(String string){
    /* if (string == null){ // prevent string entering be null
      this.string =string;
    } */
    this.string = string;
  }

  public String getString (){
    return this.string;
  }

  public void setString (String string){
    this.string = string;
  }

  public StringBox append(String str){
    if (str == null){
      return this;
    }
    this.string += str;
    return this;
  }

  public String toString (){
    return this.string;
  }

  public StringBox insert (int index, String add){
    if (index < 0 || index > this.string.length()){
      return this;
    }

    if (add.equals(null) || "".equals(add)) // make sure .equals can be called
    
    this.string = this.string.substring(0, index) + add + this.string.substring(index);
    return this;

  }

  public static void main (String[] args){
    StringBox sb = new StringBox();
    sb.setString("t"); 
    sb.append("r").append("d");
    System.out.println(sb.toString());
  }
}
