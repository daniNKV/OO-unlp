package unlp.ar.oo.ejercicio21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConductorTest {
    Conductor conductor;
    Vehiculo vehiculo;
    Conductor conductor2;
    Vehiculo vehiculo2;

    @BeforeEach
    void setUp() throws Exception {
        vehiculo = new Vehiculo("Ford Fiesta", 5, 2013, 100000);
        vehiculo2 = new Vehiculo("Chevrolet Corsa", 5, 2023, 50000);
        conductor = new Conductor("Javier Gomez", vehiculo);
        conductor2 = new Conductor("Ana Gonzales", vehiculo2);


    }
    @Test
    void testObtenerBonificacion() {
        assertEquals(1000, conductor.obtenerBonificacion());
    }

    @Test
    void testCalcularComision() {
        assertEquals(10, conductor.calcularComision(100));
        assertEquals(1, conductor2.calcularComision(100));
    }

    @Test
    void testPagarViaje() {

    }

}