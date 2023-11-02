package unlp.ar.oo.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class LlamadaLocalTest {
    LlamadaLocal llamada;

    @BeforeEach
    void setUp() throws Exception {
        this.llamada= new LlamadaLocal(LocalDate.now(), LocalTime.now(), 10, null, null);
    }
    @Test
    void testCalcularCosto() {
        assertEquals(10, llamada.calcularCosto());
    }
}