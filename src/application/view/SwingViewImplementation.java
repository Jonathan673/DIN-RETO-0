/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class SwingViewImplementation implements View{
    
    @Override
    public String showGreeting(String data) {
        JOptionPane.showMessageDialog(null, data);
        return data;
    }
}
