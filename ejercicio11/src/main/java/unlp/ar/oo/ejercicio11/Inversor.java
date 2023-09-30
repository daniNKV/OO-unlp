package unlp.ar.oo.ejercicio11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inversor implements Inversion{
    private String nombre;
    private List<Inversion> inversiones;

    public Inversor(String nombre) {
        this.nombre = nombre;
        this.inversiones = new ArrayList<>();
    }

    public Inversor(String nombre, List<Inversion> inversiones) {
        this.nombre = nombre;
        this.inversiones = inversiones;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Inversion> getInversiones() {
        return Collections.unmodifiableList(inversiones);
    }

    public void agregarInversion(Inversion inversion) {
        this.inversiones.add(inversion);
    }

    @Override
    public double valorActual() {
        return this.getInversiones()
                .stream()
                .mapToDouble(Inversion::valorActual)
                .sum();

    }
}
