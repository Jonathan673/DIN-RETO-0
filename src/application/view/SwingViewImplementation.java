/**
 * Clase encargada de mostrar el texto por pantalla mediante el Swing
 */
package application.view;

import javax.swing.JOptionPane;

/**
 * Clase la cual contiene el metodo showGreeting(), que posteriormente mostrara 
 * el saludo por Swing
 * @author Jonathan Camacho
 */
public class SwingViewImplementation implements View{
    
    /**
     * Metodo el cual se encargará de mostrar el mensaje recogido por pantalla
     * mediante un JOptionPane
     * @param data que contendra el mensaje
     */
    @Override
    public void showGreeting(String data) {
        JOptionPane.showMessageDialog(null, data);
    }
}
