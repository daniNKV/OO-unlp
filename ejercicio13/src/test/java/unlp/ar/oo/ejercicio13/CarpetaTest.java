package unlp.ar.oo.ejercicio13;

import java.util.HashSet;

public class CarpetaTest {
    Carpeta carpeta;
    public void setUp() throws Exception {
        carpeta = new Carpeta("Trabajo");
        carpeta.agregarEmail(new Email("Proyecto X", "Es importante para la organizacion. Tenga cuidado."));
        HashSet<Archivo> adjuntos = new HashSet<>();
        adjuntos.add(new Archivo("Test"));
        carpeta.agregarEmail(new Email("Test", "Esto es un test.", adjuntos));
    }

    public void testBuscarEmail() {

    }

    public void testSize() {

    }
}
