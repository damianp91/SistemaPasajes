package com.damianp.RecuParcialUnoPrograII.TransportSystem;

public class Bus extends TransportVehicle {
  // Atributes
  private double baseCost;

  // Constructor
  public Bus(String license, int capacity, String company, double cost) {
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
      "Bus{%nlicensePlate=%s%ncapacity=%d%ncapacity=%s%nbaseCost=%.2f%n}",
      getLincensePlate(),
      getCapacity(),
      getCompany(),
      baseCost
    );
  }
}
