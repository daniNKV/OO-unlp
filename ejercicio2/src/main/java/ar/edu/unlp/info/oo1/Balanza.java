package ar.edu.unlp.info.oo1;

public class Balanza extends ListadoProductos {
    public Balanza() { super(); }

    public void ponerEnCero() { super.vaciarProductos(); }

    public Ticket emitirTicket() {
        return new Ticket(super.getProductos());
    }


}
