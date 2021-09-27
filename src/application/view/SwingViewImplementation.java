/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class SwingViewImplementation {
    
    ResourceBundle greetings = ResourceBundle.getBundle("archives.greeting");
    
    public void showGreeting(){
        
        
        JOptionPane.showMessageDialog(null, greetings.getString("saludo"));
    }
}
