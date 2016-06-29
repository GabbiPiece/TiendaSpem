package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Caceres
 */
public class ConexionBD {
    // creamos un objeto tipo Conexion
    
    Connection conexion = null;
    
    //creamos un metodo para la conexion
    
    public Connection conectar() {
        try {
            // cargamos el driver para la conexion
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/tiendaspem", "adminSpem", "123456");
       
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"A ocurrido un error: " + e);
        }
        return conexion;
    }
}
