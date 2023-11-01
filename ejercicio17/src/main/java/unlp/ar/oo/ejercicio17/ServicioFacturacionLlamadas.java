package unlp.ar.oo.ejercicio17;

import java.util.Set;
import java.util.Stack;

public class ServicioFacturacionLlamadas {
    private Stack<NumeroTelefonico> numerosDisponibles;
    private Set<Cliente> clientes;

    public void agregarCliente(Cliente cliente) {
        NumeroTelefonico numero = numerosDisponibles.pop();
        cliente.agregarNumeroTelefonico(numero);
        this.clientes.add(cliente);
    }

    public void agregarNumeroDisponible(NumeroTelefonico numero) {
        this.numerosDisponibles.add(numero);
    }
}
