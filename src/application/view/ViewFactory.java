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
    
    
 ResourceBundle modelo = ResourceBundle.getBundle("archives.configViewLoader");
  
    public View getView(){
        String typeView = modelo.getString("typeView");
        View vista  = null;

       if(typeView.equalsIgnoreCase("TextViewImplementation")){
           vista = new TextViewImplementation();
       }else if(typeView.equalsIgnoreCase("SwingViewImplementation")){
           vista = new SwingViewImplementation();
       }else if(typeView.equalsIgnoreCase("JavaFXImplementation")){
           vista = new JavaFXViewImplementation();
       }else{
           System.out.println("Error en la vista");
       }
        return vista;
    }
}
