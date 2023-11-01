package unlp.ar.oo.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    Reserva reservaEstricta;
    Reserva reservaModerada;
    Reserva reservaFlexible;


    @BeforeEach
    void setUp() throws Exception {
        Usuario propietario =  new Usuario("Mariano", 100, "Avenida Siempreviva 23");
        Propiedad propiedad = new Propiedad("Departamento", "2 ambientes", "Calle Falsa 123", 100,propietario , new PoliticaEstricta());
        this.reservaEstricta = new Reserva(propiedad, propietario, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 15));
    }
    @Test
    void testPrecioTotal() {
        assertEquals(100 * 14, reservaEstricta.precioTotal());
    }

    @Test
    void testCalcularReembolso() {
        assertEquals(0, reservaEstricta.calcularReembolso(LocalDate.of(2023, 12, 15)));
    }
}