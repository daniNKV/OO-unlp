package unlp.ar.oo.ejercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReporteDeConstruccion {
    private List<Pieza> piezasConstruidas;

    public ReporteDeConstruccion() {
        this.piezasConstruidas = new ArrayList<>();
    }

    public void agregarPieza(Pieza pieza) {
        this.piezasConstruidas.add(pieza);
    }

    public List<Pieza> getPiezasConstruidas() {
        return Collections.unmodifiableList(this.piezasConstruidas);
    }

    public double getVolumenDeMaterial(String material) {
        return this.piezasConstruidas
                .stream()
                .mapToDouble(pieza -> pieza.getMaterial().equals(material) ? pieza.getVolumen() : 0.0)
                .sum();
    }

    public double getSuperficieDeColor(String color) {
        return this.piezasConstruidas
                .stream()
                .mapToDouble(pieza -> pieza.getColor().equals(color) ? pieza.getSuperficie() : 0.0)
                .sum();
    }
}
