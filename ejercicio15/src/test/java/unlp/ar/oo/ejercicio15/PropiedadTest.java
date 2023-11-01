package unlp.ar.oo.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PropiedadTest {
    Propiedad propiedad;
    @BeforeEach
    void setUp() throws Exception {
        this.propiedad = new Propiedad("Casa", "3 ambientes", "Calle Siempreviva 115", 100, new Usuario("Juan", 200, "Calle falsa 123"), new PoliticaFlexible());
        Reserva reserva1 = new Reserva(propiedad, null, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 15));
        Reserva reserva2 = new Reserva(propiedad, null, LocalDate.of(2024, 1, 21), LocalDate.of(2024, 1, 30));
        propiedad.agregarReserva(reserva1);
        propiedad.agregarReserva(reserva2);
    }
    @Test
    void testRecaudacionEntreFechas() {
        assertEquals(0, propiedad.recaudacionEntreFechas(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 2, 1)));
        assertEquals(1400, propiedad.recaudacionEntreFechas(LocalDate.of(2023, 12, 15), LocalDate.of(2024, 1, 20)));
        assertEquals(2300, propiedad.recaudacionEntreFechas(LocalDate.of(2023, 12, 15), LocalDate.of(2024, 2, 1)));
        assertEquals(1400, propiedad.recaudacionEntreFechas(LocalDate.of(2024, 1, 5), LocalDate.of(2024, 1, 17)));
    }

    @Test
    void testEstaLibre() {
        assertTrue(propiedad.estaLibre(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 2, 1)));
        assertFalse(propiedad.estaLibre(LocalDate.of(2024, 1, 5), LocalDate.of(2024, 1, 18)));
    }
}