package unlp.ar.oo.ejercicio21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PasajeroTest {
    Pasajero pasajero;
    Pasajero pasajeroConViajes;

    @BeforeEach
    void setUp() throws Exception {
        pasajero = new Pasajero("Gaston");
        pasajeroConViajes = new Pasajero("Maria");
        Vehiculo vehiculo = new Vehiculo("Ford Fiesta", 5, 2013, 100000);

        Viaje viaje = new Viaje("La Plata", "Buenos Aires", 1000, LocalDate.now().minusWeeks(1), vehiculo);

        pasajeroConViajes.agregarViaje(viaje);
    }

    @Test
    void testObtenerBonificacion() {
        assertEquals(0.0, pasajero.obtenerBonificacion());
        assertEquals(500.0, pasajeroConViajes.obtenerBonificacion());

    }

    @Test
    void testCalcularComision() {
        assertEquals(0.0, pasajero.calcularComision(100));
        assertEquals(10.0, pasajeroConViajes.calcularComision(100));
    }

    @Test
    void testTieneSaldo() {
        assertFalse(pasajero.tieneSaldo());
        pasajero.agregarSaldo(100);
        assertTrue(pasajero.tieneSaldo());
    }

}