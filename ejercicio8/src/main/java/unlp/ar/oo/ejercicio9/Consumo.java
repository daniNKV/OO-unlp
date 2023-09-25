package unlp.ar.oo.ejercicio9;

import java.time.LocalDate;

public class Consumo {
    private LocalDate fecha;
    private double consumoEnergiaActiva;
    private double consumoEnergiaReactiva;

    public Consumo(Double consumoEnergiaActiva, Double consumoEnergiaReactiva) {
        this.consumoEnergiaActiva = consumoEnergiaActiva;
        this.consumoEnergiaReactiva = consumoEnergiaReactiva;
        this.fecha = LocalDate.now();
    }

    public Consumo(LocalDate date, int energiaActiva, int energiaReactiva) {
        this.fecha = date;
        this.consumoEnergiaReactiva = energiaReactiva;
        this.consumoEnergiaActiva = energiaActiva;
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