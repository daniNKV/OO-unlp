package unlp.ar.oo.ejercicio21;

public abstract class Usuario {
    private String nombre;
    private double saldo;

    protected Usuario(String nombre) {
        this.nombre = nombre;
        this.saldo = 0;
    }
    public String getNombre() { return nombre; }

    protected double getSaldo() {
        return saldo;
    }

    protected abstract double obtenerBonificacion();

    protected abstract double calcularComision(double monto);

    public void cargarSaldo(double monto) {
        double montoFinal = monto - calcularComision(monto);
        agregarSaldo(montoFinal);
    }

    public void pagarViaje(double monto) {
        double montoFinal = monto - obtenerBonificacion();
        descontarSaldo(montoFinal);
    }

    public void agregarSaldo(double monto) {
        this.saldo += monto;
    }

    private void descontarSaldo(double monto) {
        this.saldo -= monto;
    }

}