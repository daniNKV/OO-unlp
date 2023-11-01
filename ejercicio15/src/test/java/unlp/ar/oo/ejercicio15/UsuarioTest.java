package unlp.ar.oo.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario propietario;
    Propiedad propiedadA;
    Propiedad propiedadB;

    @BeforeEach
    void setUp() throws Exception {
        propietario = new Usuario("Julian", 200, "Calle siempreviva 2024");
        propiedadA = new Propiedad("Casa", "3 ambientes", "Calle Siempreviva 115", 100, propietario, new PoliticaFlexible());
        propiedadB = new Propiedad("Casa", "1 ambientes", "Calle Siempreviva 116", 100, propietario, new PoliticaFlexible());
        Reserva reserva1 = new Reserva(propiedadA, null, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 15));
        Reserva reserva2 = new Reserva(propiedadA, null, LocalDate.of(2024, 1, 16), LocalDate.of(2024, 2, 15));
        Reserva reserva3 = new Reserva(propiedadB, null, LocalDate.of(2024, 2, 1), LocalDate.of(2024, 2, 5));
        propiedadA.agregarReserva(reserva1);
        propiedadA.agregarReserva(reserva2);
        propiedadB.agregarReserva(reserva3);
        propietario.agregarPropiedad(propiedadA);
        propietario.agregarPropiedad(propiedadB);

    }
    @Test
    void testCalcularIngresos() {
    }

    @Test
    void propiedadesDisponibles() {
        List<Propiedad> propiedadesDisponibles0 = propietario.propiedadesDisponibles(LocalDate.of(2023, 1, 1), LocalDate.of(2022, 1, 1));
        List<Propiedad> propiedadesDisponibles1 = propietario.propiedadesDisponibles(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 2, 1));
        List<Propiedad> propiedadesDisponibles2 = propietario.propiedadesDisponibles(LocalDate.of(2024, 1, 16), LocalDate.of(2024, 2, 27));

        assertTrue(propiedadesDisponibles0.contains(propiedadA));
        assertTrue(propiedadesDisponibles0.contains(propiedadB));

        assertFalse(propiedadesDisponibles1.contains(propiedadA));
        assertTrue(propiedadesDisponibles1.contains(propiedadB));

        assertFalse(propiedadesDisponibles2.contains(propiedadB));
        assertFalse(propiedadesDisponibles2.contains(propiedadA));
    }
}