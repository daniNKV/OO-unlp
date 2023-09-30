package unlp.ar.oo.ejercicio9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaCorrienteTest {
    CuentaCorriente cuentaConFondos;
    CuentaCorriente cuentaSinFondos;
    @BeforeEach
    public void setUp() {
        cuentaConFondos = new CuentaCorriente(0);
        cuentaSinFondos = new CuentaCorriente(0);

        cuentaConFondos.depositar(100);
        cuentaConFondos.setDescubierto(100);
    }
    @Test
    public void testDepositar() {
        assertEquals(0, cuentaSinFondos.getSaldo());
        cuentaSinFondos.depositar(100);
        assertEquals(100, cuentaSinFondos.getSaldo());
    }

    @Test
    public void testExtraer() {
        CuentaCorriente cuenta = new CuentaCorriente(100);
        assertEquals(0, cuentaSinFondos.getSaldo());
        assertEquals(100, cuentaConFondos.getSaldo());
        assertEquals(0, cuenta.getSaldo());

        assertFalse(cuentaSinFondos.puedeExtraer(100));
        assertFalse(cuentaSinFondos.puedeExtraer(10));
        assertFalse(cuentaSinFondos.puedeExtraer(0.5));

        assertTrue(cuentaConFondos.puedeExtraer(0.2));
        assertTrue(cuentaConFondos.puedeExtraer(50));
        assertTrue(cuentaConFondos.puedeExtraer(199.99));
        assertTrue(cuentaConFondos.puedeExtraer(100));
        assertTrue(cuentaConFondos.puedeExtraer(200));

        assertTrue(cuenta.puedeExtraer(20));
        assertTrue(cuenta.puedeExtraer(100));
        assertFalse(cuenta.puedeExtraer(110));

    }
}
