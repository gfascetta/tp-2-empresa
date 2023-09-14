package ar.edu.unq.po2.ejercicio1.empresa;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Empleado {
    //Atributos
    private String nombre;
    private String direccion;
    private EstadoCivil estadoCivil;
    private LocalDate fechaDeNacimiento;
    private double sueldoBasico;

    //Operaciones
    public int getEdad(){
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaDeNacimiento, ahora);

        return periodo.getYears();
    }

    protected abstract List<Concepto> getConceptos();

    public double sueldoBruto(){
        return getSueldoBasico();
    }
    public double retenciones(){ return 0;};
    public double sueldoNeto(){
        return sueldoBruto() - retenciones();
    }

    //GETTERS
    public String getNombre(){ return nombre;}
    public String getDireccion(){ return direccion;}
    public EstadoCivil getEstadoCivil(){ return estadoCivil;}
    public LocalDate getFechaDeNacimiento(){ return fechaDeNacimiento;}
    public double getSueldoBasico(){ return sueldoBasico;};

    //SETTERS

    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setDireccion(String direccion){ this.direccion= direccion;}
    public void setEstadoCivil(EstadoCivil estadoCivil){ this.estadoCivil= estadoCivil;}
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento){ this.fechaDeNacimiento= fechaDeNacimiento;}
    public void setSueldoBasico(double sueldoBasico){ this.sueldoBasico= sueldoBasico;}
}
