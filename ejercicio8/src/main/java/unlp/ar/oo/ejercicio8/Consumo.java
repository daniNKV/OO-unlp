package unlp.ar.oo.ejercicio8;

import java.util.Date;

public class Consumo {
    private Date fecha;
    private Double consumoEnergiaActiva;
    private Double consumoEnergiaReactiva;

    public Consumo(Double consumoEnergiaActiva, Double consumoEnergiaReactiva) {
        this.consumoEnergiaActiva = consumoEnergiaActiva;
        this.consumoEnergiaReactiva = consumoEnergiaReactiva;
        this.fecha = new Date();
    }

    public Double getEnergiaActiva() {
        return consumoEnergiaActiva;
    }

    public Double getConsumoEnergiaReactiva() {
        return consumoEnergiaReactiva;
    }

    public Double consumoEnBaseA(Double precioKWh) {
        return this.getEnergiaActiva() * precioKWh;
    }

    public Double factorDePotencia() {
        Double consumoActivoCuadrado = Math.pow(consumoEnergiaActiva, 2);
        Double consumoReactivoCuadrado = Math.pow(consumoEnergiaReactiva, 2);
        return consumoEnergiaActiva / Math.sqrt(consumoActivoCuadrado + consumoReactivoCuadrado);
    }
}