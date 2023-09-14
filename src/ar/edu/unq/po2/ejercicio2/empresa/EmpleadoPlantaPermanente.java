package ar.edu.unq.po2.ejercicio1.empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ar.edu.unq.po2.ejercicio1.empresa.EstadoCivil.CASADO;

public class EmpleadoPlantaPermanente extends Empleado {

    private int cantidadDeHijos;
    private int antiguedad;

    //CONSTRUCTOR
    public EmpleadoPlantaPermanente(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaDeNacimiento, double sueldoBasico, int cantidadDeHijos, int antiguedad){
        setNombre(nombre);
        setDireccion(direccion);
        setEstadoCivil(estadoCivil);
        setFechaDeNacimiento(fechaDeNacimiento);
        setSueldoBasico(sueldoBasico);
        this.cantidadDeHijos = cantidadDeHijos;
        this.antiguedad = antiguedad;
    }

    public double asignacionPorHijos(){
        return 150 * getCantidadDeHijos();
    }

    public double asignacionPorConyuge(){
        if(getEstadoCivil() == CASADO){
            return 100;
        }
        return 0;
    }

    public double salarioFamiliar(){
        return asignacionPorHijos() + asignacionPorConyuge();
    }

    public double asignacionPorAntiguedad() {
        return 100 * getAntiguedad();
    }

    @Override
    public double sueldoBruto(){
        return salarioFamiliar() + asignacionPorAntiguedad() + getSueldoBasico();
    }

    public double obraSocial(){
        return 20 * getCantidadDeHijos() + 0.1 * sueldoBruto();
    }

    public double aportesJubilatorios(){
        return 0.15 * sueldoBruto();
    }

    @Override
    public double retenciones(){
        return obraSocial() + aportesJubilatorios();
    }

    @Override
    public List<Concepto> getConceptos(){
        return Arrays.asList(
                new Concepto("sueldo basico", getSueldoBasico()),
                new Concepto("salario familiar", salarioFamiliar()),
                new Concepto("asignacion por antiguedad", asignacionPorAntiguedad()),
                new Concepto("obra social", obraSocial()),
                new Concepto("aportes Jubilatorios", aportesJubilatorios())
        );
    }

    //GETTERS
    public int getCantidadDeHijos(){return cantidadDeHijos;}
    public int getAntiguedad(){ return antiguedad;}
}
