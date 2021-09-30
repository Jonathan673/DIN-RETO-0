/**
 * Clase encargada del testeo de la clase ModelFactory
 */
package application.model;

import java.util.ResourceBundle;
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
        ResourceBundle modeloBundle = ResourceBundle.getBundle("archives.configModelLoader");
        String typeModel = modeloBundle.getString("typeModel");
        
        ModelFactory modelF = new ModelFactory();
        Model modelo = modelF.getModel();
        
        if (typeModel.equalsIgnoreCase("FileModelImplementation")) {
            assertEquals( modelo.getClass(), FileModelImplementation.class ); 
        } else if (typeModel.equalsIgnoreCase("ModelDBImplementation")) {
            assertEquals( modelo.getClass(), ModelDBImplementation.class ); 
        } else {
            fail("Tipo de modelo desconocido"); 
        }
        
        
    }
    
}
