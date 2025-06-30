package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class MenuCliente {

    GestorUsuarios gestor = new GestorUsuarios();
    public String opcion = "";

    public void mostrarMenu() {
        String[] opciones = {
            "Agregar Cliente",
            "Inactivar Cliente",
            "Mostrar Cliente",
            "Volver"
        };

        opcion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Menú de Clientes",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
        if (opcion == null || opcion.equals("Volver")) {
            return;
        }

        if (opcion.equals("Agregar Cliente")) {
            gestor.agregarCliente();
            mostrarMenu();

        } else if (opcion.equals("Mostrar Cliente")) {
            gestor.mostrarUsuariosPorTipo("Cliente");
            mostrarMenu();

        } else if (opcion.equals("Inactivar Cliente")) {
            gestor.inactivarUsuario();
            mostrarMenu();

        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            mostrarMenu();
        }
    }
}
