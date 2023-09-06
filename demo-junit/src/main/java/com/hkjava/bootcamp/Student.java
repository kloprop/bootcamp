package com.hkjava.bootcamp;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Getter
public class Student {
  @NonNull
  private List<Subject> subjects;

  public Student(){
    this.subjects = new ArrayList<>();
  }
  
  
}
