package unlp.ar.oo.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArchivoTest {
    Archivo archivoA;
    Archivo archivoB;


    public void setUp() throws Exception {
        archivoA = new Archivo("Un archivo");
        archivoB = new Archivo("");
    }

    public void testSize() {
        assertEquals(10, archivoA.getNombre().length());
        assertEquals(0, archivoB.getNombre().length());

    }
}
