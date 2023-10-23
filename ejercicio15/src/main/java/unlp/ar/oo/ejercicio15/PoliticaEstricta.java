package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio15.PoliticaCancelacion;

import java.time.LocalDate;

public class PoliticaEstricta extends PoliticaCancelacion {
    public PoliticaEstricta(String nombrePolitica) { super("Estricta"); }

    @Override
    public double calcularMontoDevolucion(double total, LocalDate fechaCancelacion) {
        return 0;
    }
}
