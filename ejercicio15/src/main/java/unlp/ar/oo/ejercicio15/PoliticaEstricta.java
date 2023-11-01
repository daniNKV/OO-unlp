package unlp.ar.oo.ejercicio15;

import java.time.LocalDate;

public class PoliticaEstricta implements PoliticaCancelacion {
    @Override
    public double calcularPorcentajeReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion) {
        return 0;
    }
}
