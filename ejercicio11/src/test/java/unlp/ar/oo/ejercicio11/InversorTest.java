package unlp.ar.oo.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InversorTest {
    private Inversor inversor;
    @BeforeEach
    public void setUp() {
        this.inversor = new Inversor("Juan Perez");
        PlazoFijo plazoFijo = new PlazoFijo(LocalDate.of(2023, 9, 20), 100, 10);
        InversionEnAcciones acciones = new InversionEnAcciones("Google", 10, 10);
        this.inversor.agregarInversion(plazoFijo);
        this.inversor.agregarInversion(acciones);
    }

    @Test
    public void testValorActual() {
        assertEquals(100 + 100 * Math.pow(1 + 0.1, 10), inversor.valorActual());
    }

    @Test public void testAgregarInversion() {
        Inversor inversorSinInversiones = new Inversor("Martin Perez");
        assertEquals(0, inversorSinInversiones.getInversiones().size());
        assertEquals(2, inversor.getInversiones().size());
    }
}
