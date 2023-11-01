package unlp.ar.oo.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PoliticaFlexibleTest {
    PoliticaCancelacion politica;

    @BeforeEach
    void setUp() throws Exception {
        this.politica = new PoliticaFlexible();
    }
    @Test
    void testCalcularPorcentajeReembolso() {
        LocalDate fechaReserva = LocalDate.of(2023, 1, 15);
        assertEquals(1.0, politica.calcularPorcentajeReembolso(fechaReserva, LocalDate.of(2023, 1, 10)));
        assertEquals(0.0, politica.calcularPorcentajeReembolso(fechaReserva, LocalDate.of(2023, 1, 18)));
    }
}