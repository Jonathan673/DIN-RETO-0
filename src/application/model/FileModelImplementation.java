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
public class FileModelImplementation implements Model{
    
    
    private ResourceBundle greeting;
    private String hello;
    
    public  void getGreeting(){

   
           greeting = ResourceBundle.getBundle("archives.greeting");
           
           hello = greeting.getString("saludoFile");
           System.out.println(hello);
    }
}
