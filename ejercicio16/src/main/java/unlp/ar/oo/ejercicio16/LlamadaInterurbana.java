package unlp.ar.oo.ejercicio16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LlamadaInterurbana extends Llamada {
    private double distancia;

    public LlamadaInterurbana(LocalDate fecha, LocalTime hora, double duracion, Cliente clienteDestino, Cliente clienteOrigen, double distancia) {
        super(fecha, hora, duracion, clienteDestino, clienteOrigen);
        this.distancia = distancia;
    }

    @Override
    public double calcularCosto() {
        double costoConexion = 5.0;
        if (distancia > 500) return costoConexion + this.getDuracion() * 5.0;
        else if (distancia > 100) return costoConexion + this.getDuracion() * 2.5;
        else return costoConexion + this.getDuracion() * 2.0;
    }
}
