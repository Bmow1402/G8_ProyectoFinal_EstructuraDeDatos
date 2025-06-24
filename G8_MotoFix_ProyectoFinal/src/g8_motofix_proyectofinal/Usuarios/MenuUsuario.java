package g8_motofix_proyectofinal.Usuarios;

import javax.swing.JOptionPane;

public class MenuUsuario {

    public String opcion = "";
    public Rutina r = new Rutina();

    public void mostrarMenu() {
        String[] opciones = {
            "Agregar Cliente",
            "Agregar Mecánico",
            "Mostrar Clientes",
            "Mostrar Mecanicos",
            "Mostrar Todos",
            "Inactivar por Nickname",
            "Eliminar Usuario (desapilar)",
            "Salir"
        };

        opcion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Menú de Usuarios",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcion == null) {
            return;
        }

        if (opcion.equals("Agregar Cliente")) {
            r.apilarCliente();
            mostrarMenu();
        } else if (opcion.equals("Agregar Mecánico")) {
            r.apilarMecanico();
            mostrarMenu();

        } else if (opcion.equals("Mostrar Clientes")) {
            r.mostrarClientes();
            mostrarMenu();

        } else if (opcion.equals("Mostrar Mecanicos")) {
            r.mostrarMecanicos();
            mostrarMenu();

        } else if (opcion.equals("Mostrar Todos")) {
            r.mostrarUsuarios();
            mostrarMenu();

        } else if (opcion.equals("Inactivar por Nickname")) {
            r.inactivarUsuario();
            mostrarMenu();

        } else if (opcion.equals("Eliminar Usuario (desapilar)")) {
            r.desapilarUsuario();
            mostrarMenu();

        } else if (opcion.equals("Salir")) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el sistema MotoFix.");
            System.exit(0);
        }
    }
}
