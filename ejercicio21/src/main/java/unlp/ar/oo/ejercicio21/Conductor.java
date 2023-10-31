package unlp.ar.oo.ejercicio21;

public class Conductor extends Usuario {
    Vehiculo vehiculo;

    public Conductor(String nombre, Vehiculo vehiculo) {
        super(nombre);
        this.vehiculo = vehiculo;
    }

    @Override
    public double obtenerBonificacion() {
        double porcentajeBonificacion = 0.01;
        return this.vehiculo.getValorDeMercado() * porcentajeBonificacion;
    }

    @Override
    public double calcularComision(double monto) {
        double porcentajeComision;
        if (vehiculo.antiguedadEnAnios() < 5) {
            porcentajeComision = 0.01;
        } else {
            porcentajeComision = 0.1;
        }
        return monto * porcentajeComision;
    }
}
