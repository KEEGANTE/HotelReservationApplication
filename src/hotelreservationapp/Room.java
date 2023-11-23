/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservationapp;

/**
 *
 * @author kmboya
 */
public class Room {
    private String roomNumber;
    private float price;
    private boolean booked;

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the booked
     */
    public boolean isBooked() {
        return booked;
    }

    /**
     * @param booked the booked to set
     */
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
