package com.damianp.RecuParcialUnoPrograII.MenuSystem;

import java.util.ArrayList;
import java.util.List;

import com.damianp.RecuParcialUnoPrograII.TicketSystem.RegularTicket;
import com.damianp.RecuParcialUnoPrograII.TicketSystem.SeniorTicket;
import com.damianp.RecuParcialUnoPrograII.TicketSystem.StudentTicket;
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

  /**
     * Creates and returns a transport vehicle based on user input.
     * Users can choose between Bus, Subway, or Train and specify attributes like
     * license plate, company name, and capacity.
     * 
     * @return A TransportVehicle object representing the chosen vehicle.
     */
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
    // Subway
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

  /**
     * Creates a ticket based on user input.
     * Users can select the ticket type (Regular, Student, Senior) and
     * provide details like package name and transport vehicle.
     */
  public void createTicket() {
    ticketMenu();
    System.out.print("Select kind of ticket: ");
    int selection = validation.intervals(validation.integerRead(), 1, 3);
    System.out.print("Name passenger: ");
    String name = validation.toCapitalize(validation.stringRead());
    TransportVehicle vehicle = createTrasnport();
    if(selection == 1) {
      tickets.add(new RegularTicket(name, vehicle));
    }
    else if(selection == 2) {
      tickets.add(new StudentTicket(name, vehicle));
    }
    else {
      tickets.add(new SeniorTicket(name, vehicle));
    }
  }

  public void sortingByCost() {
    System.out.println("Sorting by cost");
  }

  public void sortingByName() {
    System.out.println("Sorting by name");
  }

  public void calculateAllTrips() {
    double totalCost = 0;
    System.out.println("====             EARNINGS             ====");
    if(tickets.isEmpty()) {
      System.out.println("There're not trips yet.");
    }
    else {
      for(Ticket ticket : tickets) {
        totalCost += ticket.calculateFinalCost();
      }
    }
    System.out.printf("Total collected: $%.2f%n", totalCost);
    System.out.printf("Total trips: %d%n", tickets.size());
    System.out.println("==========================================");
  }

  /**
     * Displays all completed trips.
     * Iterates through the list of tickets and prints their information.
     * If no trips exist, a message is displayed indicating so.
     */
  public void displayTrips() {
    System.out.println("=====         COMPLETED TRIPS         =====");
    if(tickets.isEmpty()) {
      System.out.println("There're not trips yet.");
    }
    else {
      for(Ticket ticket : tickets) {
        System.out.println(ticket.toString());
      }
    }
    System.out.println("==========================================");
  }

  /**
     * Initializes the ticket office system.
     * Displays the main menu and handles user input for selecting actions
     * such as creating tickets, displaying trips, sorting data, and exiting.
     */
  public void initSystem() {
    int selection;
    do {
      mainMenu();
      System.out.print("Select option: ");
      selection = validation.integerRead();
      switch (selection) {
        case 1 -> createTicket(); 
        case 2 -> displayTrips();
        case 3 -> sortingByCost();
        case 4 -> sortingByName();
        case 5 -> calculateAllTrips();
        case 6 -> System.out.println("Exit of the System...");
        default -> System.out.println("¡Incorrect choise!.");
      }
    } while (selection != 6);
  }
}
