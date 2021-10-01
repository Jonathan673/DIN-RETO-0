/**
 * Clase encargada de mostrar el texto por consola
 */
package application.view;


/**
 * Clase la cual contiene el metodo showGreeting(), que posteriormente mostrara 
 * el saludo por consola
 * @author Alejandro Gomez
 */
public class TextViewImplementation implements View {

    /**
     * Metodo que se encargara de mostrar el mensaje recogido por consola
     * @param data que contendra el mensaje
     */
    @Override
    public void showGreeting(String data) {
        System.out.println(data);

    }

}
