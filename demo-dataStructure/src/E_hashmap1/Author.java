package E_hashmap1;

import java.util.Objects;

public class Author {
  String name;
  int age;

  public Author(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }
  /* @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Author)){
      return false;
    }
    Author a = (Author) obj;
    return Objects.equals(this.name, a.name);
  } */
  @Override
  public String toString(){
    return this.name +" "+ this.age+" ";
  }
}
