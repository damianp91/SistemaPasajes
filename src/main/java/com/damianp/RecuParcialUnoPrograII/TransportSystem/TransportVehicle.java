package com.damianp.RecuParcialUnoPrograII.TransportSystem;

import java.util.Objects;

public abstract class TransportVehicle implements Comparable<TransportVehicle> {
  // Atributes
  private String lincensePlate;
  private int capacity;
  private String company;
  
  // Constructor
  public TransportVehicle(String lincensePlate, int capacity, String company) {
    this.lincensePlate = lincensePlate;
    this.capacity = capacity;
    this.company = company;
  }
  
  // Getters
  public String getLincensePlate() {
    return lincensePlate;
  }

  public int getCapacity() {
    return capacity;
  }

  public String getCompany() {
    return company;
  }

  // Methods
  public abstract double calculateBaseCost();

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null) return false;
    if(getClass() != obj.getClass()) return false;

    TransportVehicle vehicle = (TransportVehicle) obj;
    return Objects.equals(lincensePlate, vehicle.lincensePlate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lincensePlate);
  }

  @Override
  public int compareTo(TransportVehicle vehicle) {
    // First comparation
    int companyC = this.company.compareTo(vehicle.company);
    if(companyC != 0) {
      return companyC;
    }
    // Second comparation
    return this.lincensePlate.compareTo(vehicle.lincensePlate);
  }
}
