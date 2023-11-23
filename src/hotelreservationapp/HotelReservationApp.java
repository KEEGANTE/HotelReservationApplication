/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelreservationapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author kmboya
 */
public class HotelReservationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Room room1 = new Room();
        room1.setRoomNumber("1A");
        room1.setPrice(50F);
        room1.setBooked(true);
        
        Room room2 = new Room();
        room2.setRoomNumber("1B");
        room2.setPrice(40F);
        room2.setBooked(true);
        
        Room room3 = new Room();
        room3.setRoomNumber("1C");
        room3.setBooked(false);
        
        
        Customer customer1 = new Customer();
        customer1.setName("Matthew Smith");
        customer1.setGender("male");
        Customer customer2 = new Customer();
        customer2.setName("Grace Jones");
        customer2.setGender("female");
        
        
        Reservation reservation1 = new Reservation();
        reservation1.setCustomer(customer2 );
        reservation1.setRoom(room1);
        
        LocalDate fromDate = LocalDate.of(2023, Month.DECEMBER, 25);
        LocalDate toDate = LocalDate.of(2024, Month.JANUARY, 1);
        
        reservation1.setFromDate(fromDate);
        reservation1.setToDate(toDate);
        reservation1.makeReservation();
        
        Reservation reservation2 = new Reservation();
        reservation2.setCustomer(customer1);
        reservation2.setRoom(room2);
        
        
        reservation2.setFromDate(fromDate);
        reservation2.setToDate(toDate);
        reservation2.makeReservation();
        
        
        
        ArrayList <Reservation> reservations = new ArrayList<>();
        reservations.add(reservation1);
        reservations.add(reservation2);
        
        ArrayList <Room> rooms = new ArrayList<>();
        rooms.add(room3);
        
        
        
        
        Report.displayBookings(reservations);
        Report.displayTotals(reservations);
        Report.womensTotals(reservations);
        Report.displayRooms(rooms, reservations);
        
        
    }
    
}
