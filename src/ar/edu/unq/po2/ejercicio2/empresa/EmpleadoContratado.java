package ar.edu.unq.po2.ejercicio1.empresa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmpleadoContratado extends Empleado{
    private final int numeroContrato;
    private final MedioDePago medioDePago;


    //CONSTRUCTOR
    public EmpleadoContratado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaDeNacimiento, Double sueldoBasico, int numeroContrato, MedioDePago medioDePago){
        setNombre(nombre);
        setDireccion(direccion);
        setEstadoCivil(estadoCivil);
        setFechaDeNacimiento(fechaDeNacimiento);
        setSueldoBasico(sueldoBasico);
        this.numeroContrato = numeroContrato;
        this.medioDePago = medioDePago;
    }

    private double gastoAdminContractual(){
        return 50;
    }

    @Override
    public double retenciones(){
        return gastoAdminContractual();
    }

    @Override
    public List<Concepto> getConceptos(){
        return Arrays.asList(
                new Concepto("sueldo basico", getSueldoBasico()),
                new Concepto("gasto administrativo contractual", gastoAdminContractual())
        );
    }

    //GETTERS

    public int getNumeroContrato(){ return numeroContrato;}
    public MedioDePago getMedioDePago(){ return medioDePago;}
}
