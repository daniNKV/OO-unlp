package unlp.ar.oo.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePersonaFisicaTest {
    Cliente cliente;

    @BeforeEach
    void setUp() throws Exception {
        this.cliente = new ClientePersonaFisica("Juan", "Calle Falsa 123", null, 2000 );
    }
    @Test
    void testCalcularMontoAFacturar() {
        assertEquals(0, cliente.calcularMontoAFacturar(0));
        assertEquals(10 - 10 * 0.1, cliente.calcularMontoAFacturar(10));
    }
}