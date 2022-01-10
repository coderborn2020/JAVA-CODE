import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotsTest {
    Pilots p;

    @BeforeEach
    void setUp() {
        p = new Pilots();
    }

    @Test
    void setPilotCertificateNumber() {
        p.setPilotCertificateNumber("");
        assertEquals("Unknown", p.getPilotCertificateNumber());
    }

    @Test
    void setPilotName() {
        p.setPilotName("");
        assertEquals("Unknown", p.getPilotName());
    }

    @Test
    void setPilotCellPhone() {
        p.setPilotCellPhone("");
        assertEquals("Unknown", p.getPilotCellPhone());
    }
}