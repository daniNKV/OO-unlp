package unlp.ar.oo.ejercicio8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaTest {
    Factura facturaSinDescuento;
    Factura facturaConDescuento;

    @BeforeEach
    public void setUp() {
        Usuario usuarioA = new Usuario("Martin", "24 422");
        Consumo consumoA = new Consumo(1.0, 1.0);
        this.facturaSinDescuento = new Factura(usuarioA, consumoA, 2.0);

        Usuario usuarioB = new Usuario("Juan", "21 212");
        Consumo consumoB = new Consumo(1.0, 0.0);
        this.facturaConDescuento = new Factura(usuarioB, consumoB, 2.0);
    }

    @Test
    public void testMontoTotal() {
        assertEquals(0, Double.compare(2.0, facturaSinDescuento.montoTotal()));
        assertEquals(0, Double.compare(2.0 - facturaConDescuento.descuento(), facturaConDescuento.montoTotal()));
    }

    @Test
    public void testDescuento() {
        assertEquals(0, Double.compare(0.0, facturaSinDescuento.descuento()));
        assertEquals(0, Double.compare(2.0 * 0.1, facturaConDescuento.descuento()));
    }
}
