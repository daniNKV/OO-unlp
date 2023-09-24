package unlp.ar.oo.ejercicio8.propio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio8.Consumo;
import unlp.ar.oo.ejercicio8.Factura;
import unlp.ar.oo.ejercicio8.Usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaTest {
    Factura facturaSinDescuento;
    Factura facturaConDescuento;

    @BeforeEach
    public void setUp() {
        Usuario usuarioA = new Usuario("Martin", "24 422");
        Consumo consumoA = new Consumo(1.0, 1.0);
        this.facturaSinDescuento = new Factura(usuarioA, consumoA);

        Usuario usuarioB = new Usuario("Juan", "21 212");
        Consumo consumoB = new Consumo(1.0, 0.0);
        this.facturaConDescuento = new Factura(usuarioB, consumoB);
    }

    @Test
    public void testMontoTotal() {
        assertEquals(0, Double.compare(2.0, facturaSinDescuento.getMontoEnergiaActiva()));
        assertEquals(0, Double.compare(2.0 - facturaConDescuento.getDescuento(), facturaConDescuento.getMontoEnergiaActiva()));
    }

    @Test
    public void testDescuento() {
        assertEquals(0, Double.compare(0.0, facturaSinDescuento.getDescuento()));
        assertEquals(0, Double.compare(2.0 * 0.1, facturaConDescuento.getDescuento()));
    }
}
