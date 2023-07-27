import java.util.Arrays;

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

  public char[] toCharArray(){
    char [] res = new char[this.string.length()];
    for (int i = 0 ; i< res.length ; i++){
      res[i] = this.string.charAt(i);
    } 
    return res;
  }

  public static void main (String[] args){
    StringBox sb = new StringBox();
    sb.setString("t"); 
    sb.append("r").append("d");
    System.out.println(sb);
    System.out.println(Arrays.toString(sb.toCharArray()));//[t,r,d]
    
    char [] result = sb.toCharArray(); //return address, result and res shall share same address [t,r,d]
    //result[0] = 'a';
    System.out.println(Arrays.toString(result)); // [a,r,d]
    System.out.println(Arrays.toString(sb.toCharArray())); //[t,r,d]
    
    StringBuilder sb2 = new StringBuilder("d");
    StringBuilder sb3 = new StringBuilder("d");
    System.out.println(sb2.equals(sb3)); //false
  }
}
