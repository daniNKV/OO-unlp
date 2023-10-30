package unlp.ar.oo.ejercicio19;

public class Pago6Cuotas implements MetodoDePago {
    private final double porcentajeRecargo;
    public Pago6Cuotas(double recargo) {
        this.porcentajeRecargo = recargo;
    }
    @Override
    public double calcularPrecioFinal(double monto) {
        return monto + monto * porcentajeRecargo;
    }
}
