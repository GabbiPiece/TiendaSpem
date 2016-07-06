/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Smile
 */
public class Crud {
    // creamos un obj de la conexion.
    private ConexionBD conexionBD = new ConexionBD();
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    //metodo para conectar
    public Crud() {
        try {
            if((con=conexionBD.conectar())==null){
                JOptionPane.showMessageDialog(null, "Error con la conexion de la Base de Datos");
                return;
            }
            st = con.createStatement();
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
        }
    }
    //metodo para insertar nuevos Clientes
    public boolean insertarCliente(String nombre, String apellido, int dni, String fecha_nacimiento, String direccion, int numero_contacto, String email) {
        try {
           
            String query = "INSERT INTO clientes VALUES(NULL,'"+nombre+"','"+apellido+"','"+dni+"','"+fecha_nacimiento+"','"+direccion+"','"+numero_contacto+"','"+email+"');";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "consulta ok");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "fallo la consulta");
            return false;
        }
    }
}
