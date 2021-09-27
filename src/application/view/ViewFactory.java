/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

import java.util.ResourceBundle;

/**
 *
 * @author Alejandro
 */
public class ViewFactory {
    
    
 ResourceBundle modelo = ResourceBundle.getBundle("archives.configLoader");
  
    public View getView(){
        String typeView = modelo.getString("typeView");
        View vista  = null;
       switch (typeView) {
           case  "TextViewImplementation":
               vista = new TextViewImplementation();
           case "SwingViewImplementation":
               vista = new SwingViewImplementation();
           case "JavaFXImplementation":
               vista = new JavaFXViewImplementation();
           default:
               System.out.println("Error");
       }
        return vista;
    }
}
