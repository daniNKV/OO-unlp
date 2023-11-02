package unlp.ar.oo.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePersonaJuridicaTest {
    Cliente cliente;

    @BeforeEach
    void setUp() throws Exception {
        this.cliente = new ClientePersonaJuridica("Juan", "Calle Falsa 123", null, "Asociacion Civil", 2000 );
    }
    @Test
    void testCalcularMontoAFacturar() {

    }
}