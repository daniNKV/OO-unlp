package unlp.ar.oo.ejercicio17;

public class TarifaPorPais {
    private String pais;
    private double tarifaPorMinutoDiurna;
    private double tarifaPorMinutoNocturna;

    public TarifaPorPais(String pais, double tarifaDiurna, double tarifaNocturna) {
        this.pais = pais;
        this.tarifaPorMinutoDiurna = tarifaDiurna;
        this.tarifaPorMinutoNocturna = tarifaNocturna;
    }

    public String getPais() {
        return pais;
    }

    public double getTarifa() {
        return tarifaPorMinutoDiurna;
    }
}
