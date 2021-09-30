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
 * @author 2dam
 */
public class FileModelImplementationTest {
    
    

    @Test
    public void testGetGreeting() {
        FileModelImplementation fileTest = new FileModelImplementation();
        String recibido = fileTest.getGreeting();
        assertEquals("Hello from the file", recibido);
        assertNotNull(fileTest);
    }
    
}
