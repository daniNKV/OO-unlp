package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;
import java.util.List;

public class ClientePersonaJuridica extends Cliente {
    private Integer cuil;

    public ClientePersonaJuridica(String nombre, String direccion, NumeroTelefonico numero, Integer cuil) {
        super(nombre, direccion, numero);
        this.cuil = cuil;
    }

    @Override
    public Factura facturarLlamadas(LocalDate fechaDesde, LocalDate fechaHasta, CuadroTarifario tarifas) {
        List<Llamada> llamadasRealizadas = this.getNumero().getLlamadasRealizadas(fechaDesde, fechaHasta);
        double montoAFacturar = llamadasRealizadas.stream()
                .mapToDouble(Llamada::calcularCosto)
                .sum();
        return new Factura(this, LocalDate.now(), fechaDesde, fechaHasta, montoAFacturar);
    }

}
