import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengersTest {
    Passengers p;

    @BeforeEach
    void setUp() {
        p = new Passengers();
    }
    @Test
    void setTicketNumber() {
        p.setTicketNumber("");
        assertEquals("Unknown", p.getTicketNumber());
    }

    @Test
    void setPassengerName() {
        p.setPassengerName("");
        assertEquals("Unknown", p.getPassengerName());
    }

    @Test
    void setPassengerBirthdate() {
        p.setPassengerBirthdate("");
        assertEquals("Unknown", p.getPassengerBirthdate());
    }

    @Test
    void setAdultChild() {
        p.setAdultChild("");
        assertEquals("Adult", p.getAdultChild());
    }

    @Test
    void setPassengerWeight() {
        p.setPassengerWeight(0);
        //p.setPassengerWeight(-1);
        assertEquals(1, p.getPassengerWeight());
    }

    @Test
    void setPassengerBaggage() {
        p.setPassengerBaggage("");
        assertEquals("Unknown", p.getPassengerBaggage());
    }
}