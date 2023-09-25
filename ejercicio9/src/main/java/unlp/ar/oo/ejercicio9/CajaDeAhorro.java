package unlp.ar.oo.ejercicio9;

public class CajaDeAhorro extends Cuenta {

    @Override
    public void depositar(double monto) {
        super.depositar(monto - calcularAdicional(monto));
    }
    @Override
    public boolean puedeExtraer(double monto) {
        return tieneFondosSuficientes(monto);
    }

    private boolean tieneFondosSuficientes(double monto) {
        double saldo = super.getSaldo();
        double montoRequerido = saldo + calcularAdicional(monto);
        return montoRequerido >= saldo;
    }

    private double calcularAdicional(double monto) {
        double costoAdicional = 0.02;
        return monto * costoAdicional;
    }
}
