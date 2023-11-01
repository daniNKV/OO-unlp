package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;
import java.util.List;

public class ClientePersonaJuridica extends Cliente {
    private Integer cuil;
    private String tipoPersonaJuridica;

    public ClientePersonaJuridica(String nombre, String direccion, NumeroTelefonico numero, String tipo, Integer cuil) {
        super(nombre, direccion, numero);
        this.cuil = cuil;
        this.tipoPersonaJuridica = tipo;
    }

    @Override
    public double calcularMontoAFacturar(double montoTotal) {
        return montoTotal;
    }

}
