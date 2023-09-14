package ar.edu.unq.po2.ejercicio1.empresaTest;
import ar.edu.unq.po2.ejercicio1.empresa.EmpleadoPlantaTemporaria;
import ar.edu.unq.po2.ejercicio1.empresa.EstadoCivil;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoPlantaTemporariaTest {
    EmpleadoPlantaTemporaria empleado1;
    EmpleadoPlantaTemporaria empleado2;

    @BeforeEach
    public void setUp(){
        empleado1 = new EmpleadoPlantaTemporaria("nombre1", "direccion1", EstadoCivil.CASADO, LocalDate.of(2000,11,1), 1000.0, LocalDate.of(2025, 12,31), 10);
        empleado2 = new EmpleadoPlantaTemporaria("nombre2", "direccion2", EstadoCivil.SOLTERO, LocalDate.of(1960,1,1), 1000.0, LocalDate.of(2030, 1, 1), 0);
    }

    @Test
    public void test_HorasExtras(){
        assertEquals(400, empleado1.montoHorasExtras());
        assertEquals(0, empleado2.montoHorasExtras());
    }

    @Test
    public void test_SueldoBruto(){
        assertEquals(1400, empleado1.sueldoBruto());
        assertEquals(1000, empleado2.sueldoBruto());
    }

    @Test
    public void test_ObraSocial(){
        assertEquals(100, empleado1.obraSocial());
        assertEquals(125, empleado2.obraSocial());
    }
    @Test
    public void test_aportesJubilatorios(){
        assertEquals(150, empleado1.aportesJubilatorios());
        assertEquals(100, empleado2.aportesJubilatorios());
    }
    @Test
    public void test_retenciones(){
        assertEquals(250, empleado1.retenciones());
        assertEquals(225, empleado2.retenciones());
    }
    @Test
    public void test_neto(){
        assertEquals(1150, empleado1.sueldoNeto());
        assertEquals(775, empleado2.sueldoNeto());
    }
}
