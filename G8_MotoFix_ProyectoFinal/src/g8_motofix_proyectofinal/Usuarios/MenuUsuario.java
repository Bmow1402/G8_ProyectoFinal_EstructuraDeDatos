package g8_motofix_proyectofinal.Usuarios;

import javax.swing.JOptionPane;

public class MenuUsuario {

    public String opcion = "";
    public Rutina r = new Rutina();

    public void mostrarMenu() {
        String[] opciones = {"Agregar usuario", "Eliminar Usuario", "Mostrar Usuarios", "Inactivar Usuarios por nickname", "Salir"};
        opcion = (String) (JOptionPane.showInputDialog(null, "Seleccione una opción",
                "Menú Principal - MotoFix", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]));
        if (opcion.equals("Agregar usuario")) {
            r.apilarUsuario();
            mostrarMenu();
        } else if (opcion.equals("Eliminar Usuario")) {
            r.desapilarUsuario();
            mostrarMenu();
        } else if (opcion.equals("Mostrar Usuarios")) {
            r.mostrarUsuarios();
            mostrarMenu();
        } else if (opcion.equals("Inactivar Usuarios por nickname")) {
            r.inactivarUsuario();
            mostrarMenu();
        } else if (opcion.equals("Salir")) {
            System.exit(0);
        }
    }
}




