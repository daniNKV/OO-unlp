package unlp.ar.oo.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> items;

    public Presupuesto(String cliente) {
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

    public double calcularTotal() {
        return this.items.stream()
                .mapToDouble(Item::costo)
                .reduce(0, Double::sum);
    }
}
