/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.util.ResourceBundle;

/**
 *
 * @author Jonathan
 */
public class ModelFactory {
    
    ResourceBundle modelo = ResourceBundle.getBundle("archives.configLoader");
  
    public Model getModel(){
        String typeModel = modelo.getString("typeModel");
        Model modelo = null; 
        switch(typeModel){
            case "FileModelImplementation":
                modelo = new FileModelImplementation();
            case "ModelBDImplementation":
                modelo = new ModelDBImplementation();
            default:
                System.out.println("Error, dato no valido");
        }
        return modelo; 
    }

}
