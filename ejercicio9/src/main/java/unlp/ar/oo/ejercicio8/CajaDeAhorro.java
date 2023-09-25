package unlp.ar.oo.ejercicio8;

public class CajaDeAhorro extends Cuenta {
    @Override
    public boolean puedeExtraer(double monto) {
        return false;
    }
}
