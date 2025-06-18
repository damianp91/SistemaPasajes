package com.damianp.RecuParcialUnoPrograII.TransportSystem;

public class Bus extends TransportVehicle {
  // Atributes
  private double baseCost;

  // Constructor
  public Bus(String license, int capacity, String company) {
    super(license, capacity, company);
    this.baseCost = 130.0;
  }
  
  // Getters
  public double getBaseCost() {
    return baseCost;
  }

  // Setters
  public void setBaseCost(double cost) {
    if(cost < 0) {
      this.baseCost = cost;
    }
    else {
      this.baseCost = 130.0;
    }
  }
  
  // Methods
  @Override
  public double calculateBaseCost() {
    return baseCost;
  }

  @Override
  public String toString() {
    return String.format(
      "Bus{licensePlate=%s, capacity=%d, capacity=%s, baseCost=%.2f}",
      getLincensePlate(),
      getCapacity(),
      getCompany(),
      calculateBaseCost()
    );
  }
}
