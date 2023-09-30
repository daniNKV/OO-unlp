package unlp.ar.oo.ejercicio9.propio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio8.Consumo;
import unlp.ar.oo.ejercicio8.Distribuidora;
import unlp.ar.oo.ejercicio8.Factura;
import unlp.ar.oo.ejercicio8.Usuario;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DistribuidoraTest {
    Distribuidora distribuidora;

    @BeforeEach
    public void setUp() {
        distribuidora = new Distribuidora();
        distribuidora.setPrecioKWh(1.0);

        Usuario usuarioA = new Usuario("Juan", "14 564");
        usuarioA.agregarMedicion(new Consumo(1.0, 1.0));
        usuarioA.agregarMedicion(new Consumo(2.0, 2.0));

        Usuario usuarioB = new Usuario("Martina", "8 987");
        usuarioB.agregarMedicion(new Consumo(3.0, 3.0));

        distribuidora.agregarUsuario(usuarioA);
        distribuidora.agregarUsuario(usuarioB);
    }

    @Test
    public void testAgregarUsuario() {
        Usuario usuario = new Usuario("Julian", "9 201");
        assertEquals(2, distribuidora.cantidadUsuarios());
        distribuidora.agregarUsuario(usuario);

        assertEquals(3, distribuidora.cantidadUsuarios());
    }

    @Test
    public void testFacturar() {
        List<Factura> facturas = distribuidora.facturar();
        assertEquals(2, facturas.size());
    }

    @Test
    public void testConsumoTotalActiva() {
        assertEquals(5.0, distribuidora.consumoTotalActiva());
    }
}
