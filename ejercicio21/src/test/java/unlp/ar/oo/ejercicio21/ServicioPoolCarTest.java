package unlp.ar.oo.ejercicio21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServicioPoolCarTest {
    ServicioPoolCar servicio;
    Conductor conductor;
    Pasajero pasajero1;
    Pasajero pasajero2;
    Viaje viaje;
    Vehiculo vehiculo;
    @BeforeEach
    void setUp() throws Exception {
        this.servicio = new ServicioPoolCar();
        vehiculo = new Vehiculo("Ford Kuga", 4, 2010, 10000);
        conductor = new Conductor("Juliana", vehiculo );
        pasajero1 = new Pasajero("Mariano");
        pasajero2 = new Pasajero("Carlos");

        conductor.agregarSaldo(100);
        pasajero1.agregarSaldo(1000);
        pasajero2.agregarSaldo(10000);

    }
    @Test
    void cargarMontoDeRegalo() {
        servicio.cargarMontoDeRegalo(1);
        assertEquals(1001, conductor.getSaldo());
        assertEquals(1001, pasajero1.getSaldo());
        assertEquals(10001, pasajero2.getSaldo());
    }

    @Test
    void obtenerUsuariosSegunSaldo() {
        List<Usuario> usuariosSegunSaldo = servicio.obtenerUsuariosSegunSaldo();
        assertEquals(pasajero2, usuariosSegunSaldo.get(0));
        assertEquals(pasajero1, usuariosSegunSaldo.get(1));
        assertEquals(conductor, usuariosSegunSaldo.get(2));
    }

    @Test
    void listarViajesDelDiaSiguiente() {
        List<Viaje> viajesDiaSiguiente = servicio.listarViajesDelDiaSiguiente();
        assertEquals(0, viajesDiaSiguiente.size());
        viaje = new Viaje("La Plata", "Buenos Aires", 1000, LocalDate.now().plusDays(1), vehiculo);
        servicio.registrarViaje(viaje);
        viajesDiaSiguiente = servicio.listarViajesDelDiaSiguiente();
        assertEquals(1, viajesDiaSiguiente.size());
        assertEquals(viaje, viajesDiaSiguiente.get(0));
    }

    @Test
    void procesarViajes() {
    }
}