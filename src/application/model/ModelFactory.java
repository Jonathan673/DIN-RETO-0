/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import application.view.JavaFXViewImplementation;
import application.view.SwingViewImplementation;
import application.view.TextViewImplementation;
import java.util.ResourceBundle;

/**
 *
 * @author Jonathan
 */
public class ModelFactory {

    ResourceBundle modelo = ResourceBundle.getBundle("archives.configModelLoader");

    public Model getModel() {
        String typeModel = modelo.getString("typeModel");
        Model modelo = null;
        /*
        switch(typeModel){
            case "FileModelImplementation":
                modelo = new FileModelImplementation();
            case "ModelBDImplementation":
                modelo = new ModelBDImplementation();
            default:
                System.out.println("Error, dato no valido");
        }
         */
        if (typeModel.equalsIgnoreCase("FileModelImplementation")) {
            modelo = new FileModelImplementation();
        } else if (typeModel.equalsIgnoreCase("ModelBDImplementation")) {
            modelo = new ModelBDImplementation();
        } else {
            System.out.println("Error en el modelo");
        }
        return modelo;
    }

}
