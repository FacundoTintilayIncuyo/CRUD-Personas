/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Facundo
 */ 
public class Conexion {

    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        } catch (Exception e) {
            System.out.println("ERROR"+e);

        }

    }

    public Connection getConnection() {
        return con;
    }

}
