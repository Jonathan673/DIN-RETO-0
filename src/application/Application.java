/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.model.ModelBDImplementation;
import application.view.TextViewImplementation;
import application.view.View;

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

        ModelBDImplementation dbvista = new ModelBDImplementation();
        dbvista.getGreeting();
        
    }
}
