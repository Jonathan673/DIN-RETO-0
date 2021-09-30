/**
 * Clase encargada de poner en marcha el proyecto
 */
package application.controller;

import application.model.Model;
import application.view.View;

/**
 * Clase la cual implementara el metodo run()
 * @author Alejandro Gomez
 */
public class Controller {
    
    /**
     * Metodo el cual se encarga de poner en marcha el programa en funcion a los 
     * parametros que este reciba
     * @param model
     * @param view
     * @throws Exception 
     */
    public void run(Model model, View view)throws Exception{
        String data;
        data = model.getGreeting();
        view.showGreeting(data);
        
        
    }
}