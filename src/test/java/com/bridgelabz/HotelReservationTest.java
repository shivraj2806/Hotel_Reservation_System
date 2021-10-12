package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {

        @Test
        void givenHotelOne_WhenAdded_ShouldReturnTrue() {
            System.out.println("Welcome to Hotel Reservation Program");
            HotelReservation hotelService = new HotelReservation();
            try {
                boolean hotelOne = hotelService.addHotelToList("Lakewood", 110);
                boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160);
                boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220);
                System.out.println(HotelReservation.hotelsList);
                Assertions.assertTrue(hotelOne);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

