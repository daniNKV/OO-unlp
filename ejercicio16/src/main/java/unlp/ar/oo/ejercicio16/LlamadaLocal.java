package unlp.ar.oo.ejercicio16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LlamadaLocal extends Llamada {
    public LlamadaLocal(LocalDate fecha, LocalTime hora, double duracion, Cliente clienteDestino, Cliente clienteOrigen) {
        super(fecha, hora, duracion, clienteDestino, clienteOrigen);
    }

    @Override
    public double calcularCosto() {
        double costoConexion = 1.0;
        return this.getDuracion() * costoConexion;
    }
}
