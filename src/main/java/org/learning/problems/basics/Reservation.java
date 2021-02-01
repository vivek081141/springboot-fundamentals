package org.learning.problems.basics;

public class Reservation {
  private String guestName;
  private int roomNumber;

  public Reservation(String guestName, int roomNumber) {
    this.guestName = guestName;
    this.roomNumber = roomNumber;
  }

  public String getGuestName() {
    return guestName;
  }

  public void setGuestName(String guestName) {
    this.guestName = guestName;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }
}
