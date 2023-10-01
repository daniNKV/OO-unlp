package unlp.ar.oo.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CilindroTest {
    Cilindro cilindro;

    @BeforeEach
    public void setUp() {
        this.cilindro = new Cilindro("Metal", "Rojo", 1, 3);
    }

    @Test
    public void testGetVolumen() {
    }

    @Test
    public void testGetSuperficie() {
    }
}