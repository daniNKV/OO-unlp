package unlp.ar.oo.ejercicio18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio18.Contrato;
import unlp.ar.oo.ejercicio18.ContratoDePlanta;
import unlp.ar.oo.ejercicio18.ContratoPorHora;
import unlp.ar.oo.ejercicio18.Empleado;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
    Empleado empleado;
    Empleado empleadoSinContrato;
    Contrato contratoPlantaActivo;
    Contrato contratoPorHoraActivo;

    @BeforeEach
    public void setUp() throws Exception {
        contratoPlantaActivo = new ContratoDePlanta(LocalDate.now(), 1000, 100, 100);
        contratoPorHoraActivo = new ContratoPorHora(LocalDate.of(2020, 1, 1), LocalDate.of(2023, 1, 1), 10, 10);
        empleado = new Empleado("Javier", "Gomez", 2000, LocalDate.of(2000, 1, 1), false, false);
        empleadoSinContrato = new Empleado("Marcela", "Gutierrez", 2001, LocalDate.of(1995, 1, 1), true, true);
        empleado.agregarContrato(LocalDate.now(), 1000, 100, 100);
        empleado.agregarContrato(LocalDate.of(2021, 1, 1), LocalDate.of(2022, 2, 1), 10, 10);

    }

    @Test
    void testAgregarContrato() {
        assertFalse(empleadoSinContrato.tieneContratoActivo());
        empleadoSinContrato.agregarContrato(contratoPlantaActivo);
        assertTrue(empleadoSinContrato.tieneContratoActivo());
        empleadoSinContrato.agregarContrato(contratoPorHoraActivo);
        assertNotEquals(contratoPorHoraActivo, empleadoSinContrato.getContratoActivo());
    }

    @Test
    void testGetContratoActivo() {
        empleadoSinContrato.agregarContrato(contratoPlantaActivo);
        assertEquals(contratoPlantaActivo, empleadoSinContrato.getContratoActivo());

    }

    @Test
    void testTieneContratoActivo() {
        assertTrue(empleado.tieneContratoActivo());
        assertFalse(empleadoSinContrato.tieneContratoActivo());
    }

    @Test
    void testAntiguedad() {
        assertEquals(0, empleadoSinContrato.antiguedad());
        empleadoSinContrato.agregarContrato(contratoPorHoraActivo);
        assertEquals(3, empleadoSinContrato.antiguedad());
    }

    @Test
    void testGenerarReciboDeSueldo() {
    }
}