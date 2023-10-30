package unlp.ar.oo.ejercicio17;

import java.util.List;

public class CuadroTarifario {
    private double tarifaFijaLocalPorMinuto;
    private double tarifaFijaInterurbana;
    private List<TarifaPorPais> tarifaPorPais;
    private double descuentoPersonaFisica;
    private double descuentoPersonaJuridica;

    public double getTarifaFijaLocalPorMinuto() {
        return tarifaFijaLocalPorMinuto;
    }

    public double getTarifaFijaInterurbana() {
        return tarifaFijaInterurbana;
    }

    public List<TarifaPorPais> getTarifaDePais() {
        return tarifaPorPais;
    }

    public double getDescuentoPersonaFisica() {
        return descuentoPersonaFisica;
    }

    public double getDescuentoPersonaJuridica() {
        return descuentoPersonaJuridica;
    }

    public CuadroTarifario(double tarifaFijaLocalPorMinuto, double tarifaFijaInterurbana, List<TarifaPorPais> tarifaPorPais, double descuentoPersonaFisica, double descuentoPersonaJuridica) {
        this.tarifaFijaLocalPorMinuto = tarifaFijaLocalPorMinuto;
        this.tarifaFijaInterurbana = tarifaFijaInterurbana;
        this.tarifaPorPais = tarifaPorPais;
        this.descuentoPersonaFisica = descuentoPersonaFisica;
        this.descuentoPersonaJuridica = descuentoPersonaJuridica;
    }

    public double calcularMonto(List<Llamada> llamadasRealizadas) {
        return 0.0;
    }
}
