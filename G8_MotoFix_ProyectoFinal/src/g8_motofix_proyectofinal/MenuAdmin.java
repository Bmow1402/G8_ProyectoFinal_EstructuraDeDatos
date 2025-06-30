package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class MenuAdmin {

    GestorUsuarios gestor = new GestorUsuarios();
    public String opcion = "";

    public void mostrarMenu() {
        String[] opciones = {
            "Agregar Personal Administrativo",
            "Inactivar Personal Administrativo",
            "Mostrar Personal Administrativo",
            "Volver"
        };

        opcion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Menú de Personal Administrativo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcion == null || opcion.equals("Volver")) {
            return;
        }

        if (opcion.equals("Agregar Personal Administrativo")) {
            gestor.agregarAdmin();
            mostrarMenu();

        } else if (opcion.equals("Mostrar Personal Administrativo")) {
            gestor.mostrarUsuariosPorTipo("Admin");
            mostrarMenu();

        } else if (opcion.equals("Inactivar Personal Administrativo")) {
            gestor.inactivarUsuario();
            mostrarMenu();

        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            mostrarMenu();
        }
    }
    
}
