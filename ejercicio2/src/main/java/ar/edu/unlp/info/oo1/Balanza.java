package ar.edu.unlp.info.oo1;

public class Balanza implements IBalanza {
    private int cantidadDeProductos;
    private Double pesoTotal;
    private Double precioTotal;

    public Balanza() {
        this.ponerEnCero();
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public Double getPesoTotal() {
        return pesoTotal;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.pesoTotal = 0.0;
        this.precioTotal = 0.0;
    }

    public void agregarProducto(Producto producto) {
        this.cantidadDeProductos += 1;
        this.precioTotal += producto.getPrecio();
        this.pesoTotal += producto.getPeso();
    }

    @Override
    public Ticket emitirTicket() {
        return new Ticket(cantidadDeProductos, pesoTotal, precioTotal);
    }


}
