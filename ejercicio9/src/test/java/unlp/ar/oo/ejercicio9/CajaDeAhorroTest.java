package unlp.ar.oo.ejercicio9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaDeAhorroTest {
    CajaDeAhorro cuentaConFondos;
    CajaDeAhorro cuentaSinFondos;
    @BeforeEach
    public void setUp() {
        cuentaConFondos = new CajaDeAhorro();
        cuentaSinFondos = new CajaDeAhorro();

        cuentaConFondos.depositar(100);
    }
    @Test
    public void testDepositar() {
        assertEquals(0, cuentaSinFondos.getSaldo());
        cuentaSinFondos.depositar(100);
        assertEquals(100 - 100 * 0.2, cuentaSinFondos.getSaldo());

        cuentaSinFondos.depositar(100);
        assertEquals((100 - 100 * 0.2) + (100 - 100 * 0.2), cuentaSinFondos.getSaldo());
    }

    @Test
    public void testExtraer() {
        assertEquals(0, cuentaSinFondos.getSaldo());
        cuentaSinFondos.depositar(100);
        assertEquals(100 - 100 * 0.2, cuentaSinFondos.getSaldo());

        cuentaSinFondos.depositar(100);
        assertEquals((100 - 100 * 0.2) + (100 - 100 * 0.2), cuentaSinFondos.getSaldo());
    }
}
