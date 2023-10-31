package unlp.ar.oo.ejercicio21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ViajeTest {
    Viaje viajeSemanaProxima;
    Viaje viajeManana;
    Viaje viajeEnDosDias;
    Pasajero pasajero1;
    Pasajero pasajero2;
    Pasajero pasajeroSinSaldo;
    Vehiculo vehiculo;
    Conductor conductor;

    @BeforeEach
    void setUp() throws Exception {
        vehiculo = new Vehiculo("Chevrolet Camaro", 2, LocalDate.now().getYear(), 100000);
        conductor = new Conductor("Ana", vehiculo);
        vehiculo.setConductor(conductor);

        viajeSemanaProxima = new Viaje("La Plata", "Buenos Aires", 1000, LocalDate.now().plusWeeks(1), vehiculo);
        viajeManana = new Viaje("La Plata", "Buenos Aires", 1000, LocalDate.now().plusDays(1), vehiculo);
        viajeEnDosDias = new Viaje("La Plata", "Brandsen", 2000, LocalDate.now().plusDays(2), vehiculo);
        pasajero1 = new Pasajero("Gaston");
        pasajero1.agregarSaldo(1000);

        pasajero2 = new Pasajero("Juan");
        pasajero2.agregarSaldo(10);

        pasajeroSinSaldo = new Pasajero("Fernando");
    }
    @Test
    void testAgregarPasajero() {
        assertTrue(viajeSemanaProxima.agregarPasajero(pasajero1));
        assertTrue(viajeEnDosDias.agregarPasajero(pasajero1));
        // Sin saldo
        assertFalse(viajeSemanaProxima.agregarPasajero(pasajeroSinSaldo));
        // Sin lugar disponible
        assertFalse(viajeSemanaProxima.agregarPasajero(pasajero2));
        // Poca anticipacion
        assertFalse(viajeManana.agregarPasajero(pasajero1));
    }

    @Test
    void testCobrarViaje() {

    }
}