package unlp.ar.oo.ejercicio15;

import java.time.LocalDate;

public interface PoliticaCancelacion {
    double calcularPorcentajeReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion);
}
