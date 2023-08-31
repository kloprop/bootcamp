package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)

public class PersonLombok {
  @ToString.Include
  private String name;
  private int age;

  public PersonLombok(String name){
    this.name = name;
  }
  public static void main(String[] args) {
    PersonLombok person = new PersonLombok("John", 45);
    PersonLombok person2 = new PersonLombok();
    person.setAge(3);
    System.out.println(person.getAge());
    System.out.println(person);
  }

}
