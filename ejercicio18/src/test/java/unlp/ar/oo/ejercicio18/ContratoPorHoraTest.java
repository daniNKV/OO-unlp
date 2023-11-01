package unlp.ar.oo.ejercicio18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio18.ContratoPorHora;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContratoPorHoraTest {
    ContratoPorHora contrato;
    ContratoPorHora contratoVencido;
    ContratoPorHora contratoCorto;
    @BeforeEach
    public void setUp() throws Exception {
        Empleado empleado = new Empleado("Julian", "Perez", 2000, LocalDate.of(1997,5,10), true, true);

        contrato = new ContratoPorHora(empleado, LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1), 10, 10);
        contratoVencido = new ContratoPorHora(empleado, LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1), 10, 10);
        contratoCorto = new ContratoPorHora(empleado, LocalDate.of(2023, 1, 1), LocalDate.of(2023, 2, 1), 10, 10);
    }
    @Test
    void calcularMonto() {
        assertEquals(100, contrato.calcularMonto(0));
        assertEquals(100 + 100 * 0.3, contrato.calcularMonto(6));
        assertEquals(100 + 100 * 0.5, contrato.calcularMonto(11));
        assertEquals(100 + 100 * 0.75, contrato.calcularMonto(16));
        assertEquals(100 + 100 * 1.0, contrato.calcularMonto(21));
    }

    @Test
    void estaActivo() {
        assertTrue(contrato.estaActivo());
        assertFalse(contratoVencido.estaActivo());
    }

    @Test
    void duracion() {
        assertEquals(1, contrato.duracion());
        assertEquals(0, contratoCorto.duracion());
    }
}