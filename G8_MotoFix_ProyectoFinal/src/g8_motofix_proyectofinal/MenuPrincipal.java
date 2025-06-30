package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    MenuCliente menuCliente = new MenuCliente();
    MenuAdmin menuAdmin = new MenuAdmin();
    MenuMecanico menuMecanico = new MenuMecanico();

    public String opcion = "";

    public void mostrarMenu() {
        String[] opciones = {
            "Catálogo de Clientes",
            "Catálogo de Mecánicos",
            "Catálogo de Personal Administrativo",
            "Catálogo de Motocicletas",
            "Catálogo de Servicios",
            "Salir"
        };

        opcion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Menú MOTOFIX",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcion == null) {
            return;
        }

        if (opcion.equals("Catálogo de Clientes")) {
            menuCliente.mostrarMenu();
            mostrarMenu();

        } else if (opcion.equals("Catálogo de Mecánicos")) {
            menuMecanico.mostrarMenu();
            mostrarMenu();

        } else if (opcion.equals("Catálogo de Personal Administrativo")) {
            menuAdmin.mostrarMenu();
            mostrarMenu();

        } else if (opcion.equals("Catálogo de Motocicletas")) {
            //mostrar el menu correspondiente
            mostrarMenu();
        } else if (opcion.equals("Catálogo de Servicios")) {
            //mostrar el menu correspondiente
            mostrarMenu();

        } else if (opcion.equals("Salir")) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el sistema MotoFix.");
            System.exit(0);
        }
    }
}
