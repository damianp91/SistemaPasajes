package com.damianp.RecuParcialUnoPrograII.TransportSystem;

public class Subway extends TransportVehicle {
  // Atributes
  private double baseCost;

  // Constructor
  public Subway(String license, int capacity, String company, double cost) {
    super(license, capacity, company);
    this.baseCost = cost;
  }
  
  // Methods
  @Override
  public double calculateBaseCost() {
    return baseCost;
  }

  @Override
  public String toString() {
    return String.format(
      "Subway{%nlicensePlate=%s%ncapacity=%d%ncompany=%s%nbaseCost=%.2f%n}",
      getLincensePlate(),
      getCapacity(),
      getCompany(),
      baseCost
    );
  }
}
