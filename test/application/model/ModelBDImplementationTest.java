/**
 * Clase encargada del testeo de la clase ModelBDImplementation
 */
package application.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Camacho
 */
public class ModelBDImplementationTest {
    
/**
 * Test del metodo getGreeting de la clase ModelBDImplementation
 */
    @Test
    public void testGetGreeting() {
        ModelBDImplementation fileTest = new ModelBDImplementation();
        String recibido = fileTest.getGreeting();
        assertEquals("Hola desde la base de datos", recibido);
    }
    
}
