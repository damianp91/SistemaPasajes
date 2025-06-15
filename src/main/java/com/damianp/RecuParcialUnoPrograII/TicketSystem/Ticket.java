package com.damianp.RecuParcialUnoPrograII.TicketSystem;

public interface Ticket extends Comparable<Ticket> {

  double calculateFinalCost();

  @Override
  default int compareTo(Ticket oTicket) {
    return Double.compare(this.calculateFinalCost(), oTicket.calculateFinalCost());
  }
}
