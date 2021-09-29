/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;


/**
 *
 * @author Alejandro
 */
public class TextViewImplementation implements View {

    /**
     * Metodo que se encargará de mostrar el mensaje recogido por consola
     * @param data
     * @return data
     */
    @Override
    public String showGreeting(String data) {
        System.out.println(data);
        return data;

    }

}
