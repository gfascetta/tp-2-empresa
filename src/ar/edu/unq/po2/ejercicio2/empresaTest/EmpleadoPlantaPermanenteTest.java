package ar.edu.unq.po2.ejercicio1.empresaTest;

import ar.edu.unq.po2.ejercicio1.empresa.EmpleadoPlantaPermanente;
import ar.edu.unq.po2.ejercicio1.empresa.EstadoCivil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpleadoPlantaPermanenteTest {

    EmpleadoPlantaPermanente empleado1;
    EmpleadoPlantaPermanente empleado2;

    @BeforeEach
    public void setUp(){
        empleado1 = new EmpleadoPlantaPermanente("nombre1", "direccion1", EstadoCivil.CASADO, LocalDate.of(2000,11,1), 1000, 1, 2);
        empleado2 = new EmpleadoPlantaPermanente("nombre2", "direccion2", EstadoCivil.SOLTERO, LocalDate.of(2000,1,1), 1000, 0, 10);
    }

    //DUDA: es necesario testear constructor y getters and setters?

    @Test
    public void testAsignacionPorHIjos(){
        //asignacion por hijos
        assertEquals(150, empleado1.asignacionPorHijos());
        assertEquals(0, empleado2.asignacionPorHijos());
    }

    @Test
    public void testAsignacionPorConyuge(){
        //asignacion por conyuge
        assertEquals(100,empleado1.asignacionPorConyuge());
        assertEquals(0, empleado2.asignacionPorConyuge());
    }

    @Test
    public void testSalarioFamiliar(){
        //salario familiar
        assertEquals(250, empleado1.salarioFamiliar());
        assertEquals(0, empleado2.salarioFamiliar());
    }

    @Test
    public void testAntiguedad(){
        //asignacion por antiguedad
        assertEquals(200, empleado1.asignacionPorAntiguedad());
        assertEquals(1000, empleado2.asignacionPorAntiguedad());
    }

    @Test
    public void testSueldoBruto(){
        //sueldo bruto
        assertEquals(1450, empleado1.sueldoBruto());
        assertEquals(2000, empleado2.sueldoBruto());
    }
    @Test
    public void testObraSocial(){
        // obra social
        assertEquals(165, empleado1.obraSocial());
        assertEquals(200, empleado2.obraSocial());
    }
    @Test
    public void testAportesJubilatorios(){
        // aportes jubilatorios
        assertEquals(217.5, empleado1.aportesJubilatorios());
        assertEquals(300, empleado2.aportesJubilatorios());
    }
    @Test
    public void testRetenciones(){
        // retenciones
        assertEquals(382.5, empleado1.retenciones());
        assertEquals(500, empleado2.retenciones());
    }

    @Test
    public void testNeto(){
        assertEquals(1067.5, empleado1.sueldoNeto());
        assertEquals(1500, empleado2.sueldoNeto());
    }
}
