package com.damianp.RecuParcialUnoPrograII;

import com.damianp.RecuParcialUnoPrograII.TransportSystem.Train;
import com.damianp.RecuParcialUnoPrograII.TransportSystem.TransportVehicle;

public class Main {
  public static void main(String[] args) {
    TransportVehicle train = new Train("sdf345", 67, "subte", 120);
    System.out.println(train.toString());
  }
}
