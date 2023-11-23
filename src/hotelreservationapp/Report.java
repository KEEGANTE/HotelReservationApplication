/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservationapp;

import java.util.ArrayList;

/**
 *
 * @author kmboya
 */
public class Report {
    
    public static void displayBookings(ArrayList<Reservation>reservations)
    {
        System.out.println("Customer Reservations");
        System.out.println("============================================");
        for (Reservation reservation : reservations)
        {
            String name = reservation.getCustomer().getName();
            String room = reservation.getRoom().getRoomNumber();
            String date = reservation.getFromDate().toString();
            float price = reservation.getTotalAmount();
            System.out.println(name + " room " + room + " on " + date + " total " + price);
               
        }
        
        System.out.println("=============================================");
        
        

        
        
        
    }
    
    public static void displayTotals(ArrayList<Reservation>reservations)
    {
     
       float totalAmount = 0F;
        System.out.println("Total Reservations Amount");
        System.out.println("============================================");
        
        for (Reservation reservation : reservations)
        {
          totalAmount += reservation.getTotalAmount();
           
          
            
        }
         System.out.println(totalAmount);
         System.out.println("============================================");
        
        
        
    }
    public static void womensTotals(ArrayList<Reservation>reservations)
    {
     
        float totalAmount = 0F;
        System.out.println("Womens Reservation List");
        System.out.println("============================================");
        
        for (Reservation reservation : reservations)
        {
            totalAmount += reservation.getTotalAmount();
            if("female".equalsIgnoreCase(reservation.getCustomer().getGender()))
            {
                System.out.println(reservation.getCustomer().getName() + " room " + 
                        reservation.getRoom().getRoomNumber() + " on " + 
                        reservation.getFromDate() + " total " + totalAmount);
            }
        }

         
      System.out.println("============================================");
        
        
        
    }
    public static void displayRooms(ArrayList<Room> rooms, ArrayList<Reservation> reservations)
    {
     
        
        System.out.println("Currently Available Rooms");
        System.out.println("============================================");
       
        // Create a list to store booked room numbers
        ArrayList<String> bookedRoomNumbers = new ArrayList<>();
        
        // Extract booked room numbers from reservations
        for (Reservation reservation : reservations) 
        {
        bookedRoomNumbers.add(reservation.getRoom().getRoomNumber());
        }
        
        // Display rooms that are not booked
        for (Room room : rooms) 
        {
        if (!bookedRoomNumbers.contains(room.getRoomNumber())) 
        {
            System.out.println("Room " + room.getRoomNumber());
            // Print other room details if needed
        }
        
        //System.out.println( "Room " + rooms);
        System.out.println("============================================");
        }    
    
    }     
}
