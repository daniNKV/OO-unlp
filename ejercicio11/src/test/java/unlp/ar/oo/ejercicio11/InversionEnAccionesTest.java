package unlp.ar.oo.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InversionEnAccionesTest {
    private InversionEnAcciones acciones;
    @BeforeEach
    public void setUp() {
        this.acciones = new InversionEnAcciones("Google", 10, 10);

    }

    @Test
    public void testValorActual() {
        assertEquals(100, acciones.valorActual());
    }
}
