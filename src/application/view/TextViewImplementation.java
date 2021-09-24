/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class TextViewImplementation {
    
    	// fichero config.properties
	private ResourceBundle greetings;
	private String sal;
    
    public void showGreeting(){
        this.greetings = ResourceBundle.getBundle("archives.greeting");
        sal = greetings.getString("saludo");
        System.out.println(sal);
    }
}
