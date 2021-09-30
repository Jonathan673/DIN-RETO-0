/**
 * Clase encargada del testeo de la clase FileModelImplementation
 */
package application.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Camacho
 */
public class FileModelImplementationTest {
    
/**
 * Test del metodo getGreeting de la clase FileModelImplementation
 */
    @Test
    public void testGetGreeting() {
        FileModelImplementation fileTest = new FileModelImplementation();
        String recibido = fileTest.getGreeting();
        assertEquals("Hello from the file", recibido);
        assertNotNull(fileTest);
    }
    
}
