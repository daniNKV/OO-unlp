package unlp.ar.oo.ejercicio19;

public class PagoContado implements MetodoDePago {
    public PagoContado() {
    }

    @Override
    public double calcularPrecioFinal(double monto) {
        return monto;
    }
}
