package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class MenuAdmin {

    private int opc;
    private GestorUsuarios gestor = new GestorUsuarios();

    public void mostrarMenu() {

        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "・✧・ MENÚ PERSONAL ADMINISTRATIVO ・✧・\n\n"
                + "1. Agregar Personal Administrativo\n"
                + "2. Editar Personal Administrativo\n"
                + "3. Inactivar Personal Administrativo\n"
                + "4. Mostrar Personal Administrativo\n"
                + "5. Volver\n\n"
                + "Digite su opción:"));

        switch (opc) {
            case 1: {
                gestor.agregarAdmin();
                mostrarMenu();
                break;
            }
            case 2: {
                gestor.editarUsuario(); // Ya implementado
                mostrarMenu();
                break;
            }
            case 3: {
                gestor.inactivarUsuario();
                mostrarMenu();
                break;
            }
            case 4: {
                gestor.mostrarUsuariosPorTipo("Admin");
                mostrarMenu();
                break;
            }
            case 5: {
                // Volver al menú anterior (no hace nada, simplemente retorna)
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Ups! Parece que esa opcion no esta en el menu. Intenta nuevamente. ");
                mostrarMenu();
                break;
            }
        }
    }
}
