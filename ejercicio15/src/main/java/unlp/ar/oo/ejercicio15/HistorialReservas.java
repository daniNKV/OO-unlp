package unlp.ar.oo.ejercicio15;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HistorialReservas {
    private Set<Reserva> reservas;

    public HistorialReservas() {
        this.reservas = new HashSet<>();
    }

    public List<Reserva> getReservas() {
        return reservas.stream().toList();
    }

    public void agregar(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void eliminar(Reserva reserva) {
        this.reservas.remove(reserva);
    }

    public double calcularMontoTotal() {
        return 0.0;
    }
}
