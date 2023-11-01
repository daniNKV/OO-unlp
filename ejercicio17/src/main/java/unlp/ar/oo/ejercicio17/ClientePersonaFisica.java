package unlp.ar.oo.ejercicio17;

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
    public double calcularMontoAFacturar(double montoTotal) {
        double porcentajeDescuento = 0.1;
        return montoTotal - montoTotal * porcentajeDescuento;

    }
}
