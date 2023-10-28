package unlp.ar.oo.ejercicio16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LlamadaInternacional extends Llamada {
    private String paisOrigen;
    private String paisDestino;

    public LlamadaInternacional(LocalDate fecha, LocalTime hora, double duracion, Cliente clienteDestino, Cliente clienteOrigen, String paisOrigen, String paisDestino) {
        super(fecha, hora, duracion, clienteDestino, clienteOrigen);
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
    }

    @Override
    protected double calcularCosto() {
        int horaLlamada = this.getHora().getHour();
        if (horaLlamada > 8 && horaLlamada < 20) {
            return this.getDuracion() * 4.0;
        }
        else {
            return this.getDuracion() * 3.0;
        }
    }
}
