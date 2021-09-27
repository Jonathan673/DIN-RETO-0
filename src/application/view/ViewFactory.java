/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

import application.model.FileModelImplementation;
import application.model.ModelBDImplementation;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
    
 ResourceBundle modelo = ResourceBundle.getBundle("archives.configLoader");
  
    public String getView(){
        String tipoModel = modelo.getString("type");
        if(tipoModel.equalsIgnoreCase("FileModelImplementation")){
            FileModelImplementation fileVista = new FileModelImplementation();
            fileVista.getGreeting();
        }else if(tipoModel.equalsIgnoreCase("ModelBDImplementation")){
            ModelBDImplementation dbvista = new ModelBDImplementation();
            dbvista.getGreeting();
        }else{
            System.out.println("error");
        }
        return tipoModel;
    }
}
