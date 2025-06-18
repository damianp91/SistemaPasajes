package com.damianp.RecuParcialUnoPrograII.MenuSystem;

import java.util.ArrayList;
import java.util.List;

import com.damianp.RecuParcialUnoPrograII.TicketSystem.Ticket;
import com.damianp.RecuParcialUnoPrograII.TransportSystem.Bus;
import com.damianp.RecuParcialUnoPrograII.TransportSystem.Subway;
import com.damianp.RecuParcialUnoPrograII.TransportSystem.Train;
import com.damianp.RecuParcialUnoPrograII.TransportSystem.TransportVehicle;

public class TicketOffice {
  // Atributes
  private List<Ticket> tickets;
  private Validations validation;
 
  // Constructor
  public TicketOffice() {
    this.tickets = new ArrayList<>();
    this.validation = new Validations();
  }

  /**
     * Displays the main menu for ticket reservation options.
     * Options include registering a new trip, displaying completed trips, 
     * sorting trips by cost or passenger name, viewing total revenue, and exiting.
     */
  public void mainMenu() {
    System.out.println("""
      ====        RESERVATION TICKET        ====
      1) Registering a new trip.
      2) Displaying all completed trips.
      3) Sorting trips by cost.
      4) Sorting trips by passenger name.
      5) Displaying the total revenue collected.
      6) Exit.
      ==========================================
    """);
  }

  /**
     * Displays the menu for selecting the type of transport vehicle.
     * Options include Bus, Subway, and Train.
     */
  public void transportMenu() {
    System.out.println("""
      ====    VEHICLE KIND    ====
      1) Bus (base cost $130.0).
      2) SubWay (base cost $145.0).
      3) Train (base cost $175.6).
      ============================
    """);
  }

  /**
     * Displays the menu for selecting the type of ticket.
     * Options include Regular, Student, and Senior tickets.
     */
  public void ticketMenu() {
    System.out.println("""
      ====    TICKET KIND    ====
      1) Regular.
      2) Student.
      3) Senior.
      ===========================
    """);
  }

  public TransportVehicle createTrasnport() {
    TransportVehicle vehicle = null;
    transportMenu();
    System.out.print("Select kind of transport: ");
    int selection = validation.intervals(validation.integerRead(), 1, 3);
    System.out.print("Number of license plate: ");
    String licensePlate = validation.stringRead().toUpperCase();
    System.out.print("Name company: ");
    String nameVehicle = validation.toCapitalize(validation.stringRead());
    System.out.print("Number capacity of vehicle: ");
    // Bus
    if(selection == 1) {
      int capacity = validation.intervals(validation.integerRead(), 25, 110);
      vehicle = new Bus(licensePlate, capacity, nameVehicle);
    }
    // SubWay
    else if(selection == 2) {
      int capacity = validation.intervals(validation.integerRead(), 65, 200);
      vehicle = new Subway(licensePlate, capacity, nameVehicle);
    }
    // Train
    else {
      int capacity = validation.intervals(validation.integerRead(), 65, 310);
      vehicle = new Train(licensePlate, capacity, nameVehicle);
    }
    return vehicle;
  }

}
