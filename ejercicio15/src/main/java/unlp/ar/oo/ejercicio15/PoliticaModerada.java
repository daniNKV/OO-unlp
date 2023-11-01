package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;

public class PoliticaModerada implements PoliticaCancelacion {
    @Override
    public double calcularPorcentajeReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion) {
        if (fechaCancelacion.isBefore(fechaReserva)) {
            int diasHastaReserva = new DateLapse(fechaCancelacion, fechaReserva).sizeInDays();
            if (diasHastaReserva >= 7) return 1.0;
            else if (diasHastaReserva >= 2) return 0.5;
        }
        return 0;
    }
}
