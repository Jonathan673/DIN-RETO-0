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
public class ModelDBImplementationTest {
    
/**
 * Test del metodo getGreeting de la clase ModelDBImplementation
 */
    @Test
    public void testGetGreeting() {
        ModelDBImplementation fileTest = new ModelDBImplementation();
        String recibido = fileTest.getGreeting();
        assertEquals("Hola desde la base de datos", recibido);
    }
    
}
