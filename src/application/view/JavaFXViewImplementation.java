/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jonathan
 */
public class JavaFXViewImplementation implements View{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    //metodo con el cual pintaremos la ventana y el mensaje hola JavaFX
    
    
    public void start(Stage primaryStage) throws Exception{
        
        ResourceBundle greetings = ResourceBundle.getBundle("archives.greeting");
        
        
        Label lbl = new Label();
        lbl.setText(greetings.getString("saludoJavaFX"));
        
        StackPane root = new StackPane(); 
        root.getChildren().add(lbl);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hola JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //metodo que lo ejecutará
    public String showGreeting(String data) {
        return null;
       // String[] args = null;
       // launch(args);
    } 

    
}


