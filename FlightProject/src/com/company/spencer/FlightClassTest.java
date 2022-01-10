package com.company.spencer;

import static org.junit.jupiter.api.Assertions.*;

class FlightClassTest {
    static FlightClass f;


    @org.junit.jupiter.api.Test
    void setFlightNum() {
        f.setFlightNum("112233");
        assertEquals("112233", f.getFlightNum());
    }

    @org.junit.jupiter.api.Test
    void setDestination() {
        f.setDestination("Hedrick IA");
    }

    @org.junit.jupiter.api.Test
    void setFlightDate() {
        f.setFlightDate("2020/10/22");
    }

    @org.junit.jupiter.api.Test
    void setDepartTime() {
        f.setDepartTime("2020/10/23");
    }

    @org.junit.jupiter.api.Test
    void setArrivalTime() {
        f.setArrivalTime("2020/10/24");
    }

    @org.junit.jupiter.api.Test
    void testToString() {

    }
}