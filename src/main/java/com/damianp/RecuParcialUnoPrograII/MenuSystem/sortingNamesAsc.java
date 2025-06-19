package com.damianp.RecuParcialUnoPrograII.MenuSystem;

import java.util.Comparator;

import com.damianp.RecuParcialUnoPrograII.TicketSystem.Ticket;

public class sortingNamesAsc implements Comparator<Ticket> {
  /**
     * Compares two Ticket objects based on the passenger names in ascending order.
     *
     * @param t1 the first Ticket to be compared.
     * @param t2 the second Ticket to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument
     *         is less than, equal to, or greater than the second.
     */
  @Override
  public int compare(Ticket t1, Ticket t2) {
    return t1.getPassegerName().compareTo(t2.getPassegerName());
  }
}
