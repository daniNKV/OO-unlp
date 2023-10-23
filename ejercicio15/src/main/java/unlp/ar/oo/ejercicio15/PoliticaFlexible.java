package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio15.PoliticaCancelacion;

import java.time.LocalDate;

public class PoliticaFlexible extends PoliticaCancelacion {

    public PoliticaFlexible(String nombrePolitica) {
        super("Flexible");
    }

    @Override
    public double calcularMontoDevolucion(double total, LocalDate fechaCancelacion) {
        return 0;
    }
}
