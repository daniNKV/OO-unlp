package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;
import java.time.LocalTime;

public class LlamadaLocal extends Llamada {
    public LlamadaLocal(LocalDate fecha, LocalTime hora, double duracion, Cliente clienteDestino, Cliente clienteOrigen) {
        super(fecha, hora, duracion, clienteDestino, clienteOrigen);
    }

    @Override
    public double calcularCosto() {
        double costoPorMinuto = 1.0;
        return this.getDuracion() * costoPorMinuto;
    }
}
