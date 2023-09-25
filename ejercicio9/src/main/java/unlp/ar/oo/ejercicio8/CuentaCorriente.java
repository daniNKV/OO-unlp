package unlp.ar.oo.ejercicio8;

public class CuentaCorriente extends Cuenta {
    @Override
    public boolean puedeExtraer(double monto) {
        return false;
    }
}
