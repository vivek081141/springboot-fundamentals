package org.learning.problems.basics;

import java.util.ArrayList;

//hotel has 100 rooms from 1-100
public class Hotel {

  private Reservation[] reservations = null; //list of all reservations

  private ArrayList waitList; //list of names (strings)

  public Reservation requestRoom(String guestName) {

    //1. empty reservation
    if (reservations == null || reservations.length == 0) {
      //create a reservation
      reservations = new Reservation[100];
      Reservation reservation = new Reservation(guestName, 0);
      reservations[0] = reservation;
      return  reservation;
    }
    else if (reservations.length == 100) {
      waitList.add(guestName);
      return null;
    } else {
      //partial

      //[Reservation0, reservation1, reservation2, reser3, reser4, reservv5, reservv10, reser11 , null, null] //100
      //lets assume, you have 10 reservations, 11th guest is in front of counter
      for (int i= 0; i < reservations.length; i++) {
        if (reservations[i] == null) {
          //then i know that this is empty
          Reservation reservation = new Reservation(guestName, i);
          reservations[i] = reservation;
          return reservation;
        }
      }
    }

    return null;
  }
}
