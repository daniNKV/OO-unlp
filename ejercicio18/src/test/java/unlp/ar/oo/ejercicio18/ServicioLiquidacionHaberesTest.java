package unlp.ar.oo.ejercicio18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio18.Empleado;
import unlp.ar.oo.ejercicio18.ServicioLiquidacionHaberes;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServicioLiquidacionHaberesTest {

    ServicioLiquidacionHaberes servicio;
    Empleado empleado;

    @BeforeEach
    void setUp() throws Exception {
        servicio = new ServicioLiquidacionHaberes();
        empleado = new Empleado("Julian", "Perez", 1000, LocalDate.of(2005, 1, 1), false, false);
        empleado.agregarContrato(LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 100, 10);
    }

    @Test
    void testAgregarEmpleado() {
        assertEquals(0, servicio.cantidadEmpleados());
        servicio.agregarEmpleado("Javier", "Gomez", 2000, LocalDate.of(2000, 1, 1), false, false);
        assertEquals(1, servicio.cantidadEmpleados());
    }

    @Test
    void testBuscarEmpleado() {
        servicio.agregarEmpleado(empleado);
        assertEquals(empleado, servicio.buscarEmpleado(1000));
        assertNull(servicio.buscarEmpleado(1));
    }

    @Test
    void eliminarEmpleado() {
        servicio.agregarEmpleado(empleado);
        assertEquals(1, servicio.cantidadEmpleados());
        servicio.eliminarEmpleado(empleado);
        assertEquals(0, servicio.cantidadEmpleados());
    }

    @Test
    void obtenerEmpleadosContratoVencido() {
        servicio.agregarEmpleado(empleado);
        List<Empleado> empleadosContratoVencido = servicio.obtenerEmpleadosContratoVencido();

        assertEquals(1, servicio.obtenerEmpleadosContratoVencido().size());
        assertEquals(empleadosContratoVencido.get(0), empleado);

    }

    @Test
    void generarRecibosDeSueldo() {
    }
}