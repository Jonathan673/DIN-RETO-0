/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.model.ModelBDImplementation;
import application.view.JavaFXViewImplementation;
import application.view.SwingViewImplementation;
import application.view.TextViewImplementation;
import application.view.View;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        TextViewImplementation vista = new TextViewImplementation();
//        vista.showGreeting();

//        ModelBDImplementation dbvista = new ModelBDImplementation();
//        dbvista.getGreeting();
//        SwingViewImplementation swingVista = new SwingViewImplementation();
//        swingVista.showGreeting();
        JavaFXViewImplementation fxVista = new JavaFXViewImplementation();
        fxVista.showGreeting();
        
    }
}
