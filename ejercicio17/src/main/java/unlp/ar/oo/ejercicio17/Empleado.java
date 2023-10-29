package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Empleado {
    private String nombre;
    private String apellido;
    private Integer cuil;
    private LocalDate fechaNacimiento;
    private Boolean tieneConyuge;
    private Boolean tieneHijos;
    private LocalDate inicioRelacionLaboral;
    private Set<Contrato> contratos;

    public Empleado(String nombre, String apellido, Integer cuil, LocalDate fechaNacimiento, Boolean tieneConyuge, Boolean tieneHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.fechaNacimiento = fechaNacimiento;
        this.tieneConyuge = tieneConyuge;
        this.tieneHijos = tieneHijos;
        this.inicioRelacionLaboral = LocalDate.now();
        this.contratos = new HashSet<>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCuil() {
        return cuil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Boolean getTieneConyuge() {
        return tieneConyuge;
    }

    public Boolean getTieneHijos() {
        return tieneHijos;
    }

    public void agregarContrato(LocalDate fechaInicio, double montoMensual, double montoPorConyuge, double montoPorHijos) {
        if (!this.tieneContratoActivo()) {
            this.contratos.add(new ContratoDePlanta(fechaInicio, montoMensual, montoPorConyuge, montoPorHijos));
        }
    }

    public void agregarContrato(LocalDate fechaInicio, LocalDate fechaFin, double montoPorHora, Integer horasPorMes) {
        if (!this.tieneContratoActivo()) {
            this.contratos.add(new ContratoPorHora(fechaInicio, fechaFin, montoPorHora, horasPorMes));
        }
    }

    public void agregarContrato(Contrato contrato) {
        if (!this.tieneContratoActivo()) {
            this.contratos.add(contrato);
        }
    }

    public Contrato getContratoActivo() {
        return this.contratos.stream()
                .filter(Contrato::estaActivo)
                .findFirst()
                .orElse(null);
    }

    public Boolean tieneContratoActivo() {
        return contratos.stream().anyMatch(Contrato::estaActivo);
    }

    public Integer antiguedad() {
        return this.contratos.stream()
                .mapToInt(Contrato::duracion)
                .sum();
    }

    public ReciboDeSueldo generarReciboDeSueldo() {
        Contrato contratoActivo = this.getContratoActivo();
        return new ReciboDeSueldo(nombre, apellido, cuil, antiguedad(), contratoActivo.calcularMonto(this.antiguedad()));
    }
}
