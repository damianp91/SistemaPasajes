package com.damianp.RecuParcialUnoPrograII.TicketSystem;

import com.damianp.RecuParcialUnoPrograII.TransportSystem.TransportVehicle;

public class RegularTicket implements Ticket {
  // Atributes
  private String passegerName;
  private TransportVehicle vehicle;

  // Constructor
  public RegularTicket(String name, TransportVehicle vehicle) {
    this.passegerName = name;
    this.vehicle = vehicle;
  }

  @Override
  public String getPassegerName() {
    return passegerName;
  }

  public void setPassegerName(String passegerName) {
    this.passegerName = passegerName;
  }

  // Methods
  @Override
  public double calculateFinalCost() {
    return vehicle.calculateBaseCost();
  }

  @Override
  public String toString() {
    return String.format(
      "RegularTicket{%npassegerName=%s%nvehicleType=%s%nfinalCost=%.2f%n}",
      passegerName,
      vehicle.toString(),
      calculateFinalCost()
    );
  }
}
