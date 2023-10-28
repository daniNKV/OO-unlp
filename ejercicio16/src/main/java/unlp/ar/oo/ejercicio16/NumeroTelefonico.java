package unlp.ar.oo.ejercicio16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class NumeroTelefonico {
    private List<Llamada> llamadasRealizadas;
    private Integer numero;

    public NumeroTelefonico(Integer numero) {
        this.numero = numero;
        this.llamadasRealizadas = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void agregarLlamada(Llamada llamada) {
        this.llamadasRealizadas.add(llamada);
    }

    public List<Llamada> getLlamadasRealizadas() {
        return llamadasRealizadas;
    }

    public Llamada registrarLlamadaLocal(LocalDate fecha, LocalTime hora, Cliente origen, Cliente destino, double duracion) {
        Llamada llamada = new LlamadaLocal(fecha, hora, duracion, origen, destino);
        this.llamadasRealizadas.add(llamada);
        return llamada;
    }

    public Llamada registrarLlamadaInterurbana(LocalDate fecha, LocalTime hora, Cliente origen, Cliente destino, double duracion, double distancia) {
        Llamada llamada = new LlamadaInterurbana(fecha, hora, duracion, origen, destino, distancia);
        this.llamadasRealizadas.add(llamada);
        return llamada;
    }

    public Llamada registrarLlamadaInternacional(LocalDate fecha,
                                                 LocalTime hora,
                                                 double duracion,
                                                 Cliente clienteDestino,
                                                 Cliente clienteOrigen,
                                                 String paisOrigen,
                                                 String paisDestino) {
        Llamada llamada = new LlamadaInternacional(fecha, hora, duracion, clienteDestino, clienteOrigen, paisOrigen, paisDestino);
        this.llamadasRealizadas.add(llamada);
        return llamada;
    }

    public List<Llamada> getLlamadasRealizadas(LocalDate fechaDesde, LocalDate fechaHasta) {
        return this.getLlamadasRealizadas().stream()
                .filter(llamada -> llamada.getFecha().isAfter(fechaDesde) || llamada.getFecha().isBefore(fechaHasta))
                .collect(Collectors.toList());
    }
}
