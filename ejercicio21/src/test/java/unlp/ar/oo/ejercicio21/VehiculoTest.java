package unlp.ar.oo.ejercicio21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {
    Vehiculo vehiculoNuevo;
    Vehiculo vehiculoViejo;

    @BeforeEach
    void setUp() throws Exception {
        this.vehiculoNuevo = new Vehiculo("Chevrolet Camaro", 5, LocalDate.now().getYear(), 100000);
        this.vehiculoViejo = new Vehiculo("Ford Shelby", 2, LocalDate.now().minusYears(10).getYear(), 100000);
        Conductor conductor1 = new Conductor("Juan", vehiculoViejo);
        Conductor conductor2 = new Conductor("Maria", vehiculoNuevo);

    }
    @Test
    void testAntiguedadEnAnios() {
        assertEquals(0, vehiculoNuevo.antiguedadEnAnios());
        assertEquals(10, vehiculoViejo.antiguedadEnAnios());
    }
}