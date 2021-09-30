/**
 * Clase encargada de implementar una clase concreta
 */
package application.model;


import java.util.ResourceBundle;

/**
 * 
 * @author Jonathan Camacho
 */
public class ModelFactory {
    /**
     * Metodo el cual nos devolverá una implementacion u otra 
     * en funcion de lo que tengamos escrito en nuestro configModelLoader.properties
     * @return que es el tipo de modelo a elegir
     */
    public Model getModel() {
        ResourceBundle modelo = ResourceBundle.getBundle("archives.configModelLoader");
        String typeModel = modelo.getString("typeModel");
        Model model = null;

        if (typeModel.equalsIgnoreCase("FileModelImplementation")) {
            model = new FileModelImplementation();
        } else if (typeModel.equalsIgnoreCase("ModelBDImplementation")) {
            model = new ModelBDImplementation();
        } else {
            System.out.println("Error en el modelo");
        }
        return model;
    }

}
