package unlp.ar.oo.ejercicio15;

import java.time.LocalDate;
public abstract class PoliticaCancelacion {
    String nombrePolitica;

    protected PoliticaCancelacion(String nombrePolitica) {
        this.nombrePolitica = nombrePolitica;
    }

    public String getNombrePolitica() {
        return this.nombrePolitica;
    }

    protected abstract double calcularMontoDevolucion(double total, LocalDate fechaCancelacion);
}
