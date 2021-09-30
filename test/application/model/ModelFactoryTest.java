/**
 * Clase encargada del testeo de la clase ModelFactory
 */
package application.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro Gomez
 */
public class ModelFactoryTest {
    
/**
 * Test del metodo getModel de la clase ModelFactory
 */

    @Test
    public void testGetModel() {
        ModelFactory modelF = new ModelFactory();

        assertNotNull(modelF);
        
    }
    
}
