package ar.edu.unq.po2.ejercicio1.empresaTest;
import ar.edu.unq.po2.ejercicio1.empresa.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class EmpresaTest {
    Empresa empresa1;
    EmpleadoPlantaPermanente empleadoPermanente;
    EmpleadoPlantaTemporaria empleadoTemporal;
    EmpleadoContratado empleadoContratado;
    List<Empleado> empleados;

    @BeforeEach
    public void setUp(){
        empleados= new ArrayList<>();
        empleadoPermanente = new EmpleadoPlantaPermanente("nombre1", "direccion1", EstadoCivil.CASADO, LocalDate.of(2000,11,1), 1000, 1, 2);
        empleadoTemporal =  new EmpleadoPlantaTemporaria("nombre1", "direccion1", EstadoCivil.CASADO, LocalDate.of(2000,11,1), 1000.0, LocalDate.of(2025, 12,31), 10);
        empleadoContratado = new EmpleadoContratado("nombre1", "direccion1", EstadoCivil.CASADO, LocalDate.of(2000, 11, 1), 1000.0, 001, MedioDePago.CHEQUE);
        empleados= Arrays.asList(empleadoPermanente, empleadoTemporal, empleadoContratado);
        empresa1 = new Empresa("Empresa1", "12-345678-9", empleados);
    }

    @Test
    public void testGIVENempleados_WHENsePideTotalDeBrutos_THENRetornaSumatoriaBrutos(){
        assertEquals(3850,empresa1.totalDeSueldosBrutos() );
    }
    @Test
    public void testGIVENempleados_WHENsePideTotalDeRetenciones_THENRetornaSumatoriaRetenciones(){
        assertEquals(762.5,empresa1.totalDeRetenciones());
    }
    @Test
    public void testGIVENempleados_WHENsePideTotalDeNetos_THENRetornaSumatoriaNetos(){
        assertEquals(3087.5,empresa1.totalDeSueldosNetos() );
    }
    @Test
    public void testLiquidacionDeSueldos(){
        assertEquals(3,empresa1.liquidarSueldos().size());
    }
}
