package ar.edu.unq.po2.ejercicio1.empresaTest;
import ar.edu.unq.po2.ejercicio1.empresa.EmpleadoContratado;
import ar.edu.unq.po2.ejercicio1.empresa.EstadoCivil;
import ar.edu.unq.po2.ejercicio1.empresa.MedioDePago;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoContratadoTest {
    EmpleadoContratado empleado1;
    EmpleadoContratado empleado2;

    @BeforeEach
    public void setUp() {
        empleado1 = new EmpleadoContratado("nombre1", "direccion1", EstadoCivil.CASADO, LocalDate.of(2000, 11, 1), 1000.0, 001, MedioDePago.CHEQUE);
        empleado2 = new EmpleadoContratado("nombre2", "direccion2", EstadoCivil.SOLTERO, LocalDate.of(1960, 1, 1), 1000.0, 002, MedioDePago.TRANSFERENCIABANCARIA);
    }

    @Test
    public void test_sueldoBruto() {
        assertEquals(1000, empleado1.sueldoBruto());
        assertEquals(1000, empleado2.sueldoBruto());
    }

    @Test
    public void test_retenciones(){
        assertEquals(50, empleado1.retenciones());
        assertEquals(50, empleado2.retenciones());
    }
    @Test
    public void test_neto(){
        assertEquals(850,empleado1.sueldoNeto());
        assertEquals(850,empleado2.sueldoNeto());
    }
}