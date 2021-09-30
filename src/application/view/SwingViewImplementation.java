/**
 * Clase encargada de mostrar el texto por pantalla mediante el Swing
 */
package application.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Camacho
 */
public class SwingViewImplementation implements View{
    
    /**
     * Metodo el cual se encargará de mostrar el mensaje recogido por pantalla
     * mediante un JOptionPane
     * @param data que contendra el mensaje
     * @return data
     */
    @Override
    public String showGreeting(String data) {
        JOptionPane.showMessageDialog(null, data);
        return data;
    }
}
