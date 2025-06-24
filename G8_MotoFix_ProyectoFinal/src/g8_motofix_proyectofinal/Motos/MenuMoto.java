package g8_motofix_proyectofinal.Motos;
import g8_motofix_proyectofinal.Usuarios.*;
import javax.swing.JOptionPane;

public class MenuMoto {


        
    public String opcion = "";
    public Rutina r = new Rutina();

    public void mostrarMenu() {
        String[] opciones = {
            "Agregar Motocicleta",
            "Editar Motocicleta",
            "Inactivar Motocicleta",
            "Mostrar Motocicletas",
            "Volver"
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

        if (opcion.equals("Agregar Motocicleta")) {
            //r.apilarMotocicleta();
            mostrarMenu();
        } else if (opcion.equals("Editar Motocicleta")) {
           // r.editarMecanico();
            mostrarMenu();

        } else if (opcion.equals("Inactivar Motocicleta")) {
           // r.InactivarMotocicleta();
            mostrarMenu();

        } else if (opcion.equals("Mostrar Motocicletas")) {
          //  r.mostrarMotocicletas();
            mostrarMenu();

        } else if (opcion.equals("Volver")) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el sistema MotoFix.");
            System.exit(0);
        }
    }
}


