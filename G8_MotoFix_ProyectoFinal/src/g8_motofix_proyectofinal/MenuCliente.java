package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class MenuCliente {

    private int opc;
    private GestorUsuarios gestor = new GestorUsuarios();

    public void mostrarMenu() {
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "・✧・ MENÚ CLIENTES ・✧・\n\n"
                + "1. Agregar Cliente\n"
                + "2. Editar Clientes\n"
                + "3. Inactivar Clientes\n"
                + "4. Mostrar Clientes\n"
                + "5. Volver\n\n"
                + "Digite su opción:"));

        switch (opc) {
            case 1: {
                gestor.agregarCliente();
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
                gestor.mostrarUsuariosPorTipo("Cliente");
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
