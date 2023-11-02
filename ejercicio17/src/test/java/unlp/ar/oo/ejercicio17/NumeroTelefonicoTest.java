package unlp.ar.oo.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumeroTelefonicoTest {
    NumeroTelefonico numero;
    Llamada llamadaLocal;
    Llamada llamadaInterurbana;
    Llamada llamadaInternacional;

    @BeforeEach
    void setUp() throws Exception {
        llamadaLocal = new LlamadaLocal(LocalDate.of(2023, 1, 1), LocalTime.of(15, 0,0), 100, null, null);
        llamadaInterurbana = new LlamadaInterurbana(LocalDate.of(2023, 2, 1), LocalTime.of(15, 0,0), 100, null, null, 1000);
        llamadaInternacional = new LlamadaInternacional(LocalDate.of(2023, 3, 1), LocalTime.of(15, 0,0), 100, null, null, "Argentina", "Eslovaquia");
        this.numero = new NumeroTelefonico(221987987);

        numero.agregarLlamada(llamadaLocal);
        numero.agregarLlamada(llamadaInterurbana);
        numero.agregarLlamada(llamadaInternacional);
    }

    @Test
    void testCalcularMontoLlamadas() {
        assertEquals(0, numero.calcularMontoLlamadas(LocalDate.of(2023, 4, 1), LocalDate.of(2023, 5, 1), null));
        assertEquals(1005, numero.calcularMontoLlamadas(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 3, 1), null));

    }
}