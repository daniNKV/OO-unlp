package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaCancelacion {
    @Override
    public double calcularPorcentajeReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion) {
        if (fechaCancelacion.isBefore(fechaReserva)) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
