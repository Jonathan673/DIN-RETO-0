
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.controller;

import application.model.Model;
import application.view.View;

/**
 *
 * @author Alejandro
 */
public class Controller {
    
    
    public void run(Model model, View view)throws Exception{
        String data;
        data = model.getGreeting();
        view.showGreeting(data);
        
        
    }
}