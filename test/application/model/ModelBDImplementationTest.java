/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan
 */
public class ModelBDImplementationTest {
    

    @Test
    public void testGetGreeting() {
        ModelBDImplementation fileTest = new ModelBDImplementation();
        String recibido = fileTest.getGreeting();
        assertEquals("Hola desde la base de datos", recibido);
    }
    
}
