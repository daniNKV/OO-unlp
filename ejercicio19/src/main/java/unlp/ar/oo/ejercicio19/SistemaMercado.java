package unlp.ar.oo.ejercicio19;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SistemaMercado {
    Set<Cliente> clientes;
    Set<Vendedor> vendedores;

    public SistemaMercado() {
        this.clientes = new HashSet<>();
        this.vendedores = new HashSet<>();
    }

    public Vendedor registrarVendedor(String nombre, String direccion) {
        Vendedor nuevoVendedor = new Vendedor(nombre, direccion);
        this.vendedores.add(nuevoVendedor);
        return nuevoVendedor;
    }

    public Cliente registrarCliente(String nombre, String direccion) {
        Cliente nuevoCliente = new Cliente(nombre, direccion);
        this.clientes.add(nuevoCliente);
        return nuevoCliente;
    }

    public Vendedor buscarVendedor(String nombre) {
        return this.vendedores.stream()
                .filter(vendedor -> vendedor.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public Cliente buscarCliente(String nombre) {
        return this.clientes.stream()
                .filter(cliente -> cliente.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public List<Producto> buscarProducto(String nombre) {
        return this.vendedores.stream()
                .flatMap(vendedor -> vendedor.buscarProducto(nombre).stream())
                .collect(Collectors.toList());
    }
}
