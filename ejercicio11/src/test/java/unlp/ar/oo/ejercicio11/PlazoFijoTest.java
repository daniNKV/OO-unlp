package unlp.ar.oo.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlazoFijoTest {
    private PlazoFijo plazoFijo;
    @BeforeEach
    public void setUp() {
        this.plazoFijo = new PlazoFijo(LocalDate.of(2023, 9, 20), 100, 10);

    }

    @Test
    public void testValorActual() {
        assertEquals(100 * Math.pow(1 + 0.1, 10), plazoFijo.valorActual());
    }
}
