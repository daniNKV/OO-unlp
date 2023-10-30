package unlp.ar.oo.ejercicio19;

public class EnvioExpressADomicilio extends MetodoDeEnvio {
    private double costoPorKm;
    private Mapa mapa;
    public EnvioExpressADomicilio(double costoPorKm) {
        this.mapa = new Mapa();
        this.costoPorKm = costoPorKm;
    }

    public double getCostoPorKm() {
        this.mapa = new Mapa();
        return costoPorKm;
    }

    @Override
    public double calcularCostoEnvio() {
        return costoPorKm * mapa.distanciaEntre(this.getDireccionCliente(), this.getDireccionVendedor());
    }

}
