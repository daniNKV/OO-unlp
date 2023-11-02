package unlp.ar.oo.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class LlamadaInterurbanaTest {
    LlamadaInterurbana llamadaMayor500km;
    LlamadaInterurbana llamadaMayor100km;
    LlamadaInterurbana llamada50Km;

    @BeforeEach
    void setUp() throws Exception {
        this.llamadaMayor500km = new LlamadaInterurbana(LocalDate.now(), LocalTime.now(), 10, null, null, 750);
        this.llamadaMayor100km = new LlamadaInterurbana(LocalDate.now(), LocalTime.now(), 10, null, null, 350);
        this.llamada50Km = new LlamadaInterurbana(LocalDate.now(), LocalTime.now(), 10, null, null, 50);
    }
    @Test
    void testCalcularCosto() {
        assertEquals(55.0, llamadaMayor500km.calcularCosto());
        assertEquals(30.0, llamadaMayor100km.calcularCosto());
        assertEquals(25.0, llamada50Km.calcularCosto());
    }
}