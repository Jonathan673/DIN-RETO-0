/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    
    ResourceBundle modelo = ResourceBundle.getBundle("archives.configLoader");
  
    public Model getModel(){
        String tipoModel = modelo.getString("type");
        switch(tipoModel){
            case "FileModelImplementation":
                return new FileModelImplementation();
            case "ModelBDImplementation":
                return new FileModelImplementation();
            default:
                System.out.println("Error, dato no valido");
        
        }
        return 
    }

}
