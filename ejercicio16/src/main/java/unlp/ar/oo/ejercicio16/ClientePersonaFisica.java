package unlp.ar.oo.ejercicio16;

import java.time.LocalDate;
import java.util.List;

public class ClientePersonaFisica extends Cliente {
    private Integer dni;

    public ClientePersonaFisica(String nombre, String direccion, NumeroTelefonico numero, Integer dni) {
        super(nombre, direccion, numero);
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }


    @Override
    public Factura facturarLlamadas(LocalDate fechaDesde, LocalDate fechaHasta, CuadroTarifario tarifas) {
        List<Llamada> llamadasRealizadas = this.getNumero().getLlamadasRealizadas(fechaDesde, fechaHasta);
        double montoLlamadas = llamadasRealizadas.stream()
                .mapToDouble(Llamada::calcularCosto)
                .sum();
        double montoAFacturar = montoLlamadas - montoLlamadas * 0.1;

        return new Factura(this, LocalDate.now(), fechaDesde, fechaHasta, montoAFacturar);

    }
}
