package ar.edu.unq.po2.ejercicio1.empresaTest;
import ar.edu.unq.po2.ejercicio1.empresa.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReciboDeHaberesTest {
    EmpleadoPlantaPermanente empleadoPermanente;
    ReciboDeHaberes recibo1;

    @BeforeEach
    public void setUp(){
        empleadoPermanente = new EmpleadoPlantaPermanente("nombre1", "direccion1", EstadoCivil.CASADO, LocalDate.of(2000,11,1), 1000, 1, 2);

        recibo1 = new ReciboDeHaberes(empleadoPermanente);

    }
    @Test
    public void test(){
        assertEquals(recibo1.getNombreEmpleado(), empleadoPermanente.getNombre());
        assertEquals(recibo1.getDireccion(), empleadoPermanente.getDireccion());
        assertEquals(recibo1.getSueldoBruto(), empleadoPermanente.sueldoBruto());
        assertEquals(recibo1.getSueldoNeto(), empleadoPermanente.sueldoNeto());
        assertEquals(recibo1.getDesgloceDeConceptos(), empleadoPermanente.getConceptos()); //TODO: revisar error
    }
}
