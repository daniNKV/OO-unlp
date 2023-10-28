package unlp.ar.oo.ejercicio16;

import java.util.Set;
import java.util.Stack;

public class ServicioFacturacionLlamadas {
    private Stack<NumeroTelefonico> numerosDisponibles;
    private Set<Cliente> clientes;

    public Cliente agregarClienteIndividuo(String nombre, String direccion, Integer dni) {
        NumeroTelefonico numero = numerosDisponibles.pop();
        Cliente nuevoCliente = new ClientePersonaFisica(nombre, direccion,numero, dni);
        this.clientes.add(nuevoCliente);
        return nuevoCliente;
    }

    public Cliente agregarClientePersonaJuridica(String nombre, String direccion, Integer cuil) {
        NumeroTelefonico numero = numerosDisponibles.pop();
        Cliente nuevoCliente = new ClientePersonaJuridica(nombre, direccion, numero, cuil);
        this.clientes.add(nuevoCliente);
        return nuevoCliente;
    }

    public void agregarNumeroDisponible(NumeroTelefonico numero) {
        this.numerosDisponibles.add(numero);
    }
}
