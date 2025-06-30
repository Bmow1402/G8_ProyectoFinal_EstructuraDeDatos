package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class MenuMecanico {

    GestorUsuarios gestor = new GestorUsuarios();
    public String opcion = "";

    public void mostrarMenu() {
        String[] opciones = {
            "Agregar Mecanico",
            "Inactivar Mecanico",
            "Mostrar Mecanico",
            "Volver"
        };

        opcion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Menú de Mecanicos",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcion == null || opcion.equals("Volver")) {
            return;
        }

        if (opcion.equals("Agregar Mecanico")) {
            gestor.agregarMecanico();
            mostrarMenu();

        } else if (opcion.equals("Mostrar Mecanico")) {
            gestor.mostrarUsuariosPorTipo("Mecanico");
            mostrarMenu();

        } else if (opcion.equals("Inactivar Mecanico")) {
            gestor.inactivarUsuario();
            mostrarMenu();

        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            mostrarMenu();
        }
    }

}
