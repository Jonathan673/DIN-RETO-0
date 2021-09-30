/**
 * Clase destinada a la ejecucion del programa
 */
package application;

import application.controller.Controller;
import application.model.ModelFactory;
import application.view.ViewFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Gomez
 */
public class Application {

    /**
     * Este metodo sera el encargado de ejecutar la aplicacion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ViewFactory vFactory = new ViewFactory();
        ModelFactory mFactory = new ModelFactory();
        
        Controller control = new Controller();
        try {
            control.run(mFactory.getModel(), vFactory.getView());
        } catch (Exception ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

