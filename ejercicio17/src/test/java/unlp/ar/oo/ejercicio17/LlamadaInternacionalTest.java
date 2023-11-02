package unlp.ar.oo.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class LlamadaInternacionalTest {
    LlamadaInternacional llamadaDiurna;
    LlamadaInternacional llamadaNocturna;
    @BeforeEach
    void setUp() throws Exception {
        this.llamadaDiurna = new LlamadaInternacional(LocalDate.now(), LocalTime.of(15, 0,0), 100, null, null, "Argentina", "Eslovaquia");
        this.llamadaNocturna = new LlamadaInternacional(LocalDate.now(), LocalTime.of(22, 0,0), 100, null, null, "Argentina", "Estados Unidos");
    }
    @Test
    void testCalcularCosto() {
        assertEquals(100 * 4, llamadaDiurna.calcularCosto());
        assertEquals(100 * 3, llamadaNocturna.calcularCosto());
    }
}