package unlp.ar.oo.ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DateLapseTest {
    DateLapse dateLapseA;
    DateLapse dateLapseB;
    DateLapse dateLapseC;
    @BeforeEach
    public void setUp() throws Exception {
        LocalDate dateA = LocalDate.of(2023, 10, 10);
        LocalDate dateB = LocalDate.of(2023, 10, 15);
        dateLapseA = new DateLapse(dateA, dateB);

        LocalDate dateAA = LocalDate.of(2023, 10, 11);
        LocalDate dateBB = LocalDate.of(2023, 10, 16);
        dateLapseB = new DateLapse(dateAA, dateBB);

        LocalDate dateAAA = LocalDate.of(2023, 10, 20);
        LocalDate dateBBB = LocalDate.of(2023, 10, 25);
        dateLapseC = new DateLapse(dateAAA, dateBBB);
    }
    @Test
    public void testSizeInDays() {
        assertEquals(5, dateLapseA.sizeInDays());
    }
    @Test
    public void testIncludesDate() {
        assertTrue(dateLapseA.includesDate(LocalDate.of(2023, 10, 13)));
        assertFalse(dateLapseA.includesDate(LocalDate.of(2023, 10, 5)));
        assertFalse(dateLapseA.includesDate(LocalDate.of(2023, 10, 25)));
    }
    @Test
    public void testOverlaps() {
        assertTrue(dateLapseA.overlaps(dateLapseB));
        assertTrue(dateLapseB.overlaps(dateLapseA));
        assertTrue(dateLapseA.overlaps(dateLapseA));
        assertFalse(dateLapseA.overlaps(dateLapseC));

    }


}
