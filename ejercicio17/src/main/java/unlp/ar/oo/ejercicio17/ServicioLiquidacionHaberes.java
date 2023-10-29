package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ServicioLiquidacionHaberes {
    private Set<Empleado> nominaEmpleados;

    public ServicioLiquidacionHaberes() {
        this.nominaEmpleados = new HashSet<>();
    }

    public void agregarEmpleado(String nombre, String apellido, Integer cuil, LocalDate fechaNacimiento, Boolean tieneConyuge, Boolean tieneHijos) {
        this.nominaEmpleados.add(new Empleado(nombre, apellido, cuil, fechaNacimiento, tieneConyuge, tieneHijos));
    }

    public void agregarEmpleado(Empleado empleado) {
        this.nominaEmpleados.add(empleado);
    }

    public int cantidadEmpleados() {
        return this.nominaEmpleados.size();
    }

    public Empleado buscarEmpleado(Integer cuil) {
        return this.nominaEmpleados.stream()
                .filter(empleado -> empleado.getCuil() == cuil)
                .findFirst()
                .orElse(null);
    }

    public void eliminarEmpleado(Empleado empleado) {
        this.nominaEmpleados.remove(empleado);
    }

    public List<Empleado> obtenerEmpleadosContratoVencido() {
        return this.nominaEmpleados.stream()
                .filter(empleado -> !empleado.tieneContratoActivo())
                .collect(Collectors.toList());
    }

    public List<ReciboDeSueldo> generarRecibosDeSueldo() {
        return this.nominaEmpleados.stream()
                .map(Empleado::generarReciboDeSueldo)
                .collect(Collectors.toList());
    }

}
