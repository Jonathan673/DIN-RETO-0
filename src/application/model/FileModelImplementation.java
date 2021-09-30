/**
 * Clase encargada de recoger el saludo de un fichero
 */
package application.model;

import java.util.ResourceBundle;

/**
 *
 * @author Alejandro Gomez
 */
public class FileModelImplementation implements Model {

    private ResourceBundle greeting;
    private String hello;

    /**
     * Este metodo se encarga de coger el saludo desde el fichero
     * @return hello 
     */
    @Override
    public String getGreeting() {

        greeting = ResourceBundle.getBundle("archives.greeting");
        hello = greeting.getString("greetingFile");
        return hello;
    }
}
