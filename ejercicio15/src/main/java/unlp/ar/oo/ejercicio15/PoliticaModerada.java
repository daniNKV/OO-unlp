package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio15.PoliticaCancelacion;

import java.time.LocalDate;

public class PoliticaModerada extends PoliticaCancelacion {

    public PoliticaModerada(String nombrePolitica) {
        super("Moderada");
    }

    @Override
    public double calcularMontoDevolucion(double total, LocalDate fechaCancelacion) {
        return 0;
    }
}
