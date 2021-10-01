/**
 * Clase encargada de implementar una clase concreta
 */
package application.view;

import java.util.ResourceBundle;

/**
 * Clase la cual contiene el metodo getView() que se encarga de hacer la 
 * implementacion
 * @author Alejandro Gomez
 */
public class ViewFactory {
    
 ResourceBundle modelo = ResourceBundle.getBundle("archives.configViewLoader");
     /**
     * Metodo el cual nos devolverá una implementacion de la vista
     * en funcion de lo que tengamos escrito en nuestro configViewLoader.properties
     * @return que es el tipo de vista elegida
     */
    public View getView(){
        String typeView = modelo.getString("typeView");
        View vista  = null;

       if(typeView.equalsIgnoreCase("TextViewImplementation")){
           vista = new TextViewImplementation();
       }else if(typeView.equalsIgnoreCase("SwingViewImplementation")){
           vista = new SwingViewImplementation();
       }else{
           System.out.println("Error en la vista");
       }
        return vista;
    }
}
