/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class conexión {
    public String db="basereserva";
    public String url="jdbc:mysql://192.168.0.102/"+db;
    public String user="root";
    public String pass="";

    public conexión() {
    }
    
    public Connection conectar(){
        Connection link=null;
        
        try {
            Class.forName("org.gjt.mm.mysql");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null,e);
        }
        return link;
    }
}
