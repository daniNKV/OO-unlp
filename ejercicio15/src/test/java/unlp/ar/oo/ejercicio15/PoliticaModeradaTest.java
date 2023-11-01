package unlp.ar.oo.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PoliticaModeradaTest {
    PoliticaCancelacion politica;

    @BeforeEach
    void setUp() throws Exception {
        this.politica = new PoliticaModerada();
    }

    @Test
    void testCalcularPorcentajeReembolso() {
        LocalDate fechaReserva = LocalDate.of(2023, 1, 15);
        // cancelacion post reserva
        assertEquals(0, politica.calcularPorcentajeReembolso(fechaReserva, LocalDate.of(2023,2,1)));
        // cancelacion con mas de 7 dias de anticipacion
        assertEquals(1.0, politica.calcularPorcentajeReembolso(fechaReserva, LocalDate.of(2023, 1, 1)));
        // cancelacion con mas de 2 dias de anticipacion
        assertEquals(0.5, politica.calcularPorcentajeReembolso(fechaReserva, LocalDate.of(2023, 1, 12)));
    }
}