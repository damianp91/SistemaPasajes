package com.damianp.RecuParcialUnoPrograII;

import com.damianp.RecuParcialUnoPrograII.TicketSystem.SeniorTicket;
import com.damianp.RecuParcialUnoPrograII.TicketSystem.Ticket;
import com.damianp.RecuParcialUnoPrograII.TransportSystem.Train;
import com.damianp.RecuParcialUnoPrograII.TransportSystem.TransportVehicle;

public class Main {
  public static void main(String[] args) {
    
    TransportVehicle train = new Train("sdf345", 67, "subte", 120);
  
    Ticket ticket = new SeniorTicket("Pepito perez", train);
    System.out.println(ticket.toString());
  }
}
