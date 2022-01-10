import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    Flight f;

    @BeforeEach
    void setUp() {
        List<Passengers> passengersList = new ArrayList<Passengers>();
        passengersList.add(new Passengers("100", "Joe Smith", "12/21/1991", "Adult", 175, "checked"));
        passengersList.add(new Passengers("101", "Joan Smith", "12/21/1993", "Adult", 135, "checked"));
        passengersList.add(new Passengers("102", "Jill Smith", "12/21/2013", "Child", 95, "carry-on"));
        List<Pilots> pilotsList = new ArrayList<Pilots>();
        pilotsList.add(new Pilots("54326A", "Ray Donavan", "612-456-4356"));
        pilotsList.add(new Pilots("78943B", "Mike Michaels", "702-312-6723"));

        f = new Flight("CJ5KL", "Orlando", "04/01/2021", "09:50am", "12:30pm", pilotsList, passengersList);
    }

    @Test
    void setFlightNumber() {
        f.setFlightNumber("");
        assertEquals("Unknown", f.getFlightNumber());
    }

    @Test
    void setDestination() {
        f.setDestination("");
        assertEquals("Unknown", f.getDestination());
    }

    @Test
    void setFlightDate() {
        f.setFlightDate("");
        assertEquals("Unknown", f.getFlightDate());
    }

    @Test
    void setDepartureTime() {
        f.setDepartureTime("");
        assertEquals("Unknown", f.getDepartureTime());
    }

    @Test
    void setArrivalTime() {
        f.setArrivalTime("");
        assertEquals("Unknown", f.getArrivalTime());
    }

    @Test
    void calcPassengerWeight() {
        assertEquals(445, f.calcPassengerWeight());
    }

    @Test
    void calcAdult() {
        assertEquals(2, f.calcAdult());
    }

    @Test
    void calcChild() {
        assertEquals(1, f.calcChild());
    }
}