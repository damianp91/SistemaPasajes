package com.damianp.RecuParcialUnoPrograII.MenuSystem;

import java.util.ArrayList;
import java.util.List;

import com.damianp.RecuParcialUnoPrograII.TicketSystem.Ticket;

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
      1) Bus.
      2) SubWay.
      3) Train.
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

}
