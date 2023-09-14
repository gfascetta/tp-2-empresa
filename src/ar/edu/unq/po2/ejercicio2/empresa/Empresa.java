package ar.edu.unq.po2.ejercicio1.empresa;

import java.util.*;

public class Empresa {

    //Atributos
    private String nombre;
    private String cuit;
    private List<Empleado> empleados;

    // CONSTRUCTOR
    public Empresa(String nombre, String cuit, List<Empleado> empleados){
        this.nombre= nombre;
        this.cuit = cuit;
        this.empleados = empleados;
    }

    //Operaciones
    public double totalDeSueldosNetos(){
        return empleados.stream().mapToDouble(Empleado::sueldoNeto).sum();
    }

    public double totalDeRetenciones(){
        return empleados.stream().mapToDouble(Empleado::retenciones).sum();
    }

    public double totalDeSueldosBrutos(){
        return empleados.stream().mapToDouble(Empleado::sueldoBruto).sum();
    }

    public ArrayList<ReciboDeHaberes> liquidarSueldos(){
        ArrayList<ReciboDeHaberes> recibosGenerados;
        recibosGenerados = new ArrayList<>();
        empleados.stream().forEach(empleado -> recibosGenerados.add(generarReciboDeHaberes(empleado)));
        return recibosGenerados;
    }

    public ReciboDeHaberes generarReciboDeHaberes (Empleado empleado) {
        return new ReciboDeHaberes(empleado);
    }
}
