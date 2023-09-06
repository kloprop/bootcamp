package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

// @AllArgsConstructor
// @RequiredArgsConstructor
@Builder


public class Address{
  private String addrLine1;
  private String addrLine2;
  private String addrLine3;
  @NonNull
  private Country country;
  

/*   public Address (Country country){
    if (country == null){
      throw new NullPointerException();
    }
    this.country = country;
  } */

  public static void main(String[] args) {
    // Address a1 = new Address(null);
    // System.out.println(a1.addrLine1);
    Address a2 = Address.builder().addrLine1("").addrLine2("").addrLine3("").country(Country.HK).build();
    
    //System.out.println("A"+" "+ a1.country);
  }
  
}
