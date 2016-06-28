package clases;

/**
 *
 * @author Smile
 */
public class Datos {

    public boolean validarUsuario(String usuario, String clave) {
        if (usuario.equals("gabbi") && clave.equals("milonga")) {
            return true;
        } else {
            return false;
        }
    }
}
