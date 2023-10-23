package unlp.ar.oo.ejercicio14;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DateLapseTest {
    DateLapse dateLapseA;

    public void setUp() throws Exception {
        LocalDate dateA = LocalDate.of(2023, 10, 10);
        LocalDate dateB = LocalDate.of(2023, 10, 15);
        dateLapseA = new DateLapse(dateA, dateB);
    }

    public void testSizeInDays() {
        assertEquals(5, dateLapseA.sizeInDays());
    }

    public void testIncludesDate() {
        assertTrue(dateLapseA.includesDate(LocalDate.of(2023, 10, 13)));
        assertFalse(dateLapseA.includesDate(LocalDate.of(2023, 10, 5)));
        assertFalse(dateLapseA.includesDate(LocalDate.of(2023, 10, 25)));
    }


}
