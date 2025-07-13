package g8_motofix_proyectofinal;
import javax.swing.JOptionPane;

public class MenuServicio {

    private int opc;
    private GestorUsuarios gestor = new GestorUsuarios();

    public void mostrarMenu() {

        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "・✧・ MENÚ SERVICIOS ・✧・\n\n"
                + "1. Agregar Servicio\n"
                + "2. Editar Servicios\n"
                + "3. Inactivar Servicio\n"
                + "4. Mostrar Servicios\n"
                + "5. Volver\n\n"
                + "Digite su opción:"));

        switch (opc) {
            case 1: {
                //  gestor.agregarMoto();
                mostrarMenu();
                break;
            }
            case 2: {
                // gestor.editarMoto();
                mostrarMenu();
                break;
            }
            case 3: {
                //  gestor.inactivarMoto();
                mostrarMenu();
                break;
            }
            case 4: {
                //  gestor.mostrarMoto();
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
