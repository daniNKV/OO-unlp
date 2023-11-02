package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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

    public void registrarLlamada(Llamada llamada) {
        this.llamadasRealizadas.add(llamada);
    }

    private List<Llamada> getLlamadasRealizadas(LocalDate fechaDesde, LocalDate fechaHasta) {
        return this.getLlamadasRealizadas().stream()
                .filter(llamada ->
                        (llamada.getFecha().isAfter(fechaDesde) || llamada.getFecha().isEqual(fechaDesde)) &&
                        (llamada.getFecha().isBefore(fechaHasta)) || llamada.getFecha().isEqual(fechaHasta))
                .collect(Collectors.toList());
    }

    public double calcularMontoLlamadas(LocalDate fechaDesde, LocalDate fechaHasta, CuadroTarifario tarifas) {
        return getLlamadasRealizadas(fechaDesde, fechaHasta).stream()
                .mapToDouble(Llamada::calcularCosto)
                .sum();
    }
}
