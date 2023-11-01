package unlp.ar.oo.ejercicio18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio18.ContratoDePlanta;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContratoDePlantaTest {
    ContratoDePlanta contrato;
    ContratoDePlanta contratoMedio;
    ContratoDePlanta contratoLargo;
    @BeforeEach
    public void setUp() throws Exception {
        Empleado empleado = new Empleado("Julian", "Perez", 2000, LocalDate.of(1997,5,10), true, true);
        contrato = new ContratoDePlanta(empleado, LocalDate.now(), 1000, 100, 100);
        contratoMedio = new ContratoDePlanta(empleado, LocalDate.of(2013, 1, 1), 1000, 100, 100);
        contratoLargo = new ContratoDePlanta(empleado, LocalDate.of(2002, 1, 1), 1000, 100, 100);

    }

    @Test
    void calcularMonto() {
        assertEquals(1200, contrato.calcularMonto(0));
        assertEquals(1200 + 1200 * 0.3, contrato.calcularMonto(6));
        assertEquals(1200 + 1200 * 0.5, contrato.calcularMonto(11));
        assertEquals(1200 + 1200 * 0.75, contrato.calcularMonto(16));
        assertEquals(1200 + 1200, contrato.calcularMonto(21));
    }

    @Test
    void estaActivo() {
        assertTrue(contrato.estaActivo());
    }

    @Test
    void duracion() {
        assertEquals(0, contrato.duracion());
        assertEquals(10, contratoMedio.duracion());
        assertEquals(21, contratoLargo.duracion());

    }
}