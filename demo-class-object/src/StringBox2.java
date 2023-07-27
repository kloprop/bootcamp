import java.util.Arrays;

public class StringBox2 {
  private char [] string;

  public StringBox2(char [] arr){ // reference is passed, would possibly change the original obj
    /* // approach 1
    this.string = new char[arr.length] ;
    for (int i = 0 ; i< arr.length; i++){
      this.string[i] = arr[i];
    } */

     //approach 2
    //copyOf() -> new array obj, and with all copied values
    //this.string= Arrays.copyOf(arr,arr.length);
    this.string = arr; //wrong

  }

  public char[] getString (){
    return this.string;
  }

  public void setString (char [] arr){
    this.string = arr;
  }

  public String toString (){
    return Arrays.toString(this.string);
  }

  public StringBox2 append(String s){
    char modified [] = new char[this.string.length + s.length()];
    for (int i = 0; i< modified.length; i++){
      if (i < this.string.length)
      modified[i] = this.string[i];
      else{
      modified[i] = s.charAt(i-this.string.length);
    }
    }
    this.string= modified;
    return this;
  }

  public static void main(String[] args) {
    char [] chars = new char [] {'a','v','f'};
    StringBox2 box2 = new StringBox2 (chars); // passing array through constructor
    System.out.println(box2.toString()); //[a,v,f]
    //box2.append("op");
    chars[1] = 'i'; // second value of chars changed
    System.out.println(Arrays.toString(chars)); // [a,i,f]
    System.out.println(box2.toString()); // [a,i,f]
  }
}
