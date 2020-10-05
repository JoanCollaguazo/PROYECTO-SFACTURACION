/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OxOrboy!
 */
public class ConexionBD {
    //DATOS DE CONEXION
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="ANTONYj1";
    private static final String url="jdbc:mysql://localhost:3306/loggin? useUnicode=true&use"
            + " JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public static Connection conectar(){
    Connection conexion = null;
        try {
            Class.forName(driver);
            conexion = (Connection)DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException|SQLException e) {
            System.out.println("ERROR: "+e);
        }
        return conexion;
    }
}
            
    
    

