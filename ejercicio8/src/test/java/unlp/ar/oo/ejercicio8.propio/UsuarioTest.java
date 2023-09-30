package unlp.ar.oo.ejercicio9.propio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unlp.ar.oo.ejercicio8.Consumo;
import unlp.ar.oo.ejercicio8.Factura;
import unlp.ar.oo.ejercicio8.Usuario;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    Usuario usuario;
    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Juana", "22 424");

        Consumo consumo1 = new Consumo(1.0, 1.0);
        Consumo consumo2 = new Consumo(2.0, 2.0);

        usuario.agregarMedicion(consumo1);
        usuario.agregarMedicion(consumo2);
    }
    @Test
    public void testAgregarMedicion() {
        Consumo consumo = new Consumo(3.0, 3.0);
        usuario.agregarMedicion(consumo);
        assertEquals(0, Double.compare(3.0, usuario.ultimoConsumoActiva()));
    }
    @Test
    public void testUltimoConsumoActivo() {
        assertEquals(0, Double.compare(2.0, usuario.ultimoConsumoActiva()));
    }

    @Test
    public void testFacturarEnBaseA() {
        Factura factura = usuario.facturarEnBaseA(1.0);
        List<Factura> facturas = usuario.facturas();
        assertEquals(usuario, factura.getUsuario());
        assertEquals(factura, facturas.get(facturas.size() - 1));
    }
}
