package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;

public class PoliticaModerada implements PoliticaCancelacion {
    @Override
    public double calcularPorcentajeReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion) {
        if (fechaCancelacion.isBefore(fechaReserva)) {
            int diasHastaReserva = new DateLapse(fechaCancelacion, fechaCancelacion).sizeInDays();
            if (diasHastaReserva <= 7) return 1.0;
            else return 0.5;
        } else return 0;
    }
}
