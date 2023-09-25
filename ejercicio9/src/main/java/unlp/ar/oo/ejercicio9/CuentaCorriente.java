package unlp.ar.oo.ejercicio9;

public class CuentaCorriente extends Cuenta {
    private double descubierto;
    public CuentaCorriente() {
        super();
        this.descubierto = 0;
    }

    public CuentaCorriente(double descubierto) {
        super();
        this.descubierto = descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    public double getDescubierto() {
        return descubierto;
    }
    @Override
    public boolean puedeExtraer(double monto) {
        return suficientesFondos(monto) || suficienteDescubierto(monto);
    }

    private boolean suficientesFondos(double monto) {
        return super.getSaldo() >= monto;
    }

    private boolean suficienteDescubierto(double monto) {
        double montoFaltante = Math.abs(super.getSaldo() - monto);
        return getDescubierto() >= montoFaltante;
    }

}
