package ar.edu.unq.po2.ejercicio1.empresa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmpleadoPlantaTemporaria extends Empleado {
    private LocalDate fechaFinDeDesignacion;
    private int cantidadHorasExtra;


    //CONSTRUCTOR
    public EmpleadoPlantaTemporaria(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaDeNacimiento, Double sueldoBasico, LocalDate fechaFinDeDesignacion, int cantidadHorasExtra){
        setNombre(nombre);
        setDireccion(direccion);
        setEstadoCivil(estadoCivil);
        setFechaDeNacimiento(fechaDeNacimiento);
        setSueldoBasico(sueldoBasico);
        this.fechaFinDeDesignacion = fechaFinDeDesignacion;
        this.cantidadHorasExtra = cantidadHorasExtra;
    }

    public double montoHorasExtras() {
        return 40 * getCantidadHorasExtra();
    }

    @Override
    public double sueldoBruto(){
        return montoHorasExtras() + getSueldoBasico();
    }

    public double obraSocial(){
        double recargoSiEsMayorA50;
        recargoSiEsMayorA50 = 0;
        if (getEdad() > 50){
            recargoSiEsMayorA50 = 25;
        }
        return 0.1 * sueldoBruto() + recargoSiEsMayorA50;
    }

    public double aportesJubilatorios(){
        return 0.1 * sueldoBruto() + 5 * getCantidadHorasExtra();
    }

    @Override
    public List<Concepto> getConceptos(){
        return Arrays.asList(
                new Concepto("sueldo basico", getSueldoBasico()),
                new Concepto("horas extra", montoHorasExtras()),
                new Concepto("obra social", obraSocial()),
                new Concepto("aportes Jubilatorios", aportesJubilatorios())
        );
    }

    @Override
    public double retenciones(){
        return obraSocial() + aportesJubilatorios();
    }

    //GETTERS
    public LocalDate getFechaFinDeDesignacion(){return fechaFinDeDesignacion;}
    public int getCantidadHorasExtra(){ return cantidadHorasExtra;}
}
