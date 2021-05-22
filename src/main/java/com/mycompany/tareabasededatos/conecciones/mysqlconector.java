/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareabasededatos.conecciones;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author herna
 */
public class mysqlconector {
    Connection con = null;
    
    public Connection conectar(){
        String db = "jdbc:mysql://localhost/tarea";
        String usuario ="root";
        String pass="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(db,usuario,pass);
            JOptionPane.showMessageDialog(null, "Base de datos conectada");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos");
        }
        
        return con;
    }
    
}
