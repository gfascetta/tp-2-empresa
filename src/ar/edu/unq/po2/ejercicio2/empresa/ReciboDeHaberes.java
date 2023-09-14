package ar.edu.unq.po2.ejercicio1.empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ReciboDeHaberes {
    //Atributos
    private String nombreEmpleado;
    private String direccion;
    private LocalDate fechaDeEmision;
    private double sueldoBruto;
    private double sueldoNeto;
    private List<Concepto> desgloceDeConceptos;

    // CONSTRUCTOR
    public ReciboDeHaberes(Empleado empleado){
        nombreEmpleado = empleado.getNombre();
        direccion = empleado.getDireccion();
        setFechaDeEmision(LocalDate.now());
        sueldoBruto = empleado.sueldoBruto();
        sueldoNeto = empleado.sueldoNeto();
        desgloceDeConceptos = empleado.getConceptos();
    }

    // SETTERS
    public void setFechaDeEmision(LocalDate fechaDeEmision){
        this.fechaDeEmision = fechaDeEmision;
    }

    //GETTERS
    public String getNombreEmpleado(){ return nombreEmpleado;}
    public String getDireccion(){return direccion;}
    public List<Concepto> getDesgloceDeConceptos(){ return desgloceDeConceptos;}
    public double getSueldoBruto(){ return sueldoBruto;}
    public double getSueldoNeto(){return sueldoNeto;}
}
