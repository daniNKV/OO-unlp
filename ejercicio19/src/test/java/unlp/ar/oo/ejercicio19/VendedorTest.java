package unlp.ar.oo.ejercicio19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VendedorTest {
    Vendedor vendedor;

    @BeforeEach
    public void setUp() throws Exception {
        this.vendedor = new Vendedor("Juan", "Calle Falsa 123");
    }

    @Test
    void agregarProductoEnVenta() {
        assertEquals(0, vendedor.cantidadProductosEnVenta());
        vendedor.agregarProductoEnVenta("Martillo Braco", "Barato y duradero", 200.0, 10);
        assertEquals(1, vendedor.cantidadProductosEnVenta());
    }

    @Test
    void buscarProducto() {

    }

}