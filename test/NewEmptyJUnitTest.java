/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemapeaje.Camion;
import sistemapeaje.Carro;
import sistemapeaje.Moto;
import sistemapeaje.Persona;

/**
 *
 * @author Yo
 */
public class NewEmptyJUnitTest {
    private Persona persona1;
    private Persona persona2;
    private Carro carro1;
    private Carro carro2;
    private Moto moto1;
    private Camion camion1;
    public NewEmptyJUnitTest() {
    }
    
    @Before
    public void setUp() {
        persona1 = new Persona("Juan", "Perez", "123456789", new Date());
        persona2 = new Persona("Maria", "Gomez", "987654321", new Date());

        // Crear vehículos
        carro1 = new Carro("ABC123");
        carro2 = new Carro("DEF456");
        moto1 = new Moto("GHI789");
        camion1 = new Camion("JKL012", 3);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void desasignarVehiculo() {
        persona1.asignarVehiculo(carro1);
        persona1.desasignarVehiculo(carro1);
        assertEquals(0, persona1.vehiculos.size());
    }
@Test
    public void testCalcularTotalPeaje() {
        // You may rename this method to better suit the purpose of your test case
        // Your test case logic here
        persona1.asignarVehiculo(carro1);
        persona1.asignarVehiculo(moto1);
        persona2.asignarVehiculo(carro2);
        persona2.asignarVehiculo(camion1);

        assertEquals(15000, persona1.calcularTotalPeajes());
        assertEquals(25000, persona2.calcularTotalPeajes());
    }
    
    @Test void obtenerTartifaCarro(){
        assertEquals(10000, carro1.getValorPeaje());
    }
    
    @Test void obtenerTartifaMoto(){
        assertEquals(5000, moto1.getValorPeaje());
    }
    
    @Test void obtenerTartifaCamion(){
        assertEquals(5000, camion1.getValorPeajeEje());
    }
     
    
    @Test void obtenerNumeroDeEjesCamion(){
        assertEquals(3, camion1.getNumeroEjes());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
