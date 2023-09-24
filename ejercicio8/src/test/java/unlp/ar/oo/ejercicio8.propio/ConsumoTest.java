package unlp.ar.oo.ejercicio8.propio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio8.Consumo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ConsumoTest {
    Consumo consumo;
    @BeforeEach
    public void setUp() {
        consumo = new Consumo(1.0, 1.0);
    }

    @Test
    public void testConsumoEnBaseA() {
        assertEquals(0, Double.compare(1.0, consumo.consumoEnBaseA(1.0)));
    }

    @Test
    public void testFactorDePotencia() {
        assertEquals(0, Double.compare(1.0 / Math.sqrt(2.0), consumo.factorDePotencia()));
    }
}
