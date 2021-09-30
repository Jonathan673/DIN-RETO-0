/**
 * Clase encargada de mostrar el texto por consola
 */
package application.view;


/**
 *
 * @author Alejandro Gomez
 */
public class TextViewImplementation implements View {

    /**
     * Metodo que se encargara de mostrar el mensaje recogido por consola
     * @param data que contendra el mensaje
     * @return data
     */
    @Override
    public String showGreeting(String data) {
        System.out.println(data);
        return data;

    }

}
