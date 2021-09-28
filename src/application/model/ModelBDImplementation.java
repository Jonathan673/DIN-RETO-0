/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Jonathan
 */
public class ModelBDImplementation implements Model {

    // fichero config.properties
    private ResourceBundle configFile;
    private String driverBD;
    private String urlBD;
    private String userBD;
    private String contraBD;
    //variables locales
    private Connection con;
    private PreparedStatement stmt;

    //sentencia sql
    private final String saludar = "SELECT * from greeting";

    //conexion con la base de datos    
    public ModelBDImplementation() {
        this.configFile = ResourceBundle.getBundle("archives.config");
        this.driverBD = configFile.getString("driver");
        this.urlBD = configFile.getString("con");
        this.userBD = configFile.getString("DBUSER");
        this.contraBD = configFile.getString("DBPASS");
    }

    private void openConnection() {
        try {

            con = (Connection) DriverManager.getConnection(this.urlBD, this.userBD, this.contraBD);

        } catch (SQLException e) {
            System.out.println("Error al intentar abrir la BD");
        }
    }

    private void closeConnection() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }

    //metodo 

    public String getGreeting() {
        this.openConnection();
        ResultSet rs = null;
        String saludo = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement(saludar);

            rs = stmt.executeQuery();
            
            while(rs.next()){
                saludo = rs.getString(1);
                System.out.println(saludo);
            }
            
            
            
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        try {
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("error al cerrar la connection");
            e.printStackTrace();
        }
        return saludo;
    }
}
