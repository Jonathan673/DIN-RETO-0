/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.util.ResourceBundle;

/**
 *
 * @author Alejandro
 */
public class FileModelImplementation implements Model {

    private ResourceBundle greeting;
    private String hello;

    /**
     * Este metodo se encarga de coger el saludo desde el fichero
     * @return hello 
     */
    @Override
    public String getGreeting() {

        greeting = ResourceBundle.getBundle("archives.greeting");

        hello = greeting.getString("greetingFile");
        return hello;
    }
}
