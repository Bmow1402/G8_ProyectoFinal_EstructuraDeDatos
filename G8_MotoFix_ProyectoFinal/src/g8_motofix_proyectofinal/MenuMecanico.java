package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class MenuMecanico {

    private int opc;
    private GestorUsuarios gestor = new GestorUsuarios();

    public void mostrarMenu() {
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "・✧・ MENÚ MECÁNICOS ・✧・\n\n"
                + "1. Agregar Mecánico\n"
                + "2. Editar Mecánicos\n"
                + "3. Inactivar Mecánicos\n"
                + "4. Mostrar Mecánicos\n"
                + "5. Volver\n\n"
                + "Digite su opción:"));

        switch (opc) {
            case 1: {
                gestor.agregarMecanico();
                mostrarMenu();
                break;
            }
            case 2: {
                gestor.editarUsuario();
                mostrarMenu();
                break;
            }
            case 3: {
                gestor.inactivarUsuario();
                mostrarMenu();
                break;
            }
            case 4: {
                gestor.mostrarUsuariosPorTipo("Mecanico");
                mostrarMenu();
                break;
            }
            case 5: {
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Ups! Parece que esa opcion no esta en el menu. Intenta nuevamente. ");
                mostrarMenu();
            }
        }
    }
}
