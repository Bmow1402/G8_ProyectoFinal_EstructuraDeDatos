package g8_motofix_proyectofinal.Usuarios;
//voy a hacerlo tipo pila, en lguar de cola

import javax.swing.JOptionPane;

public class Rutina {

    public NodoUsuario cima;

    public Rutina() {
        this.cima = null;
    }

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    //agrega un usuario a la pila (al principio)
    public void apilarUsuario() {
        Usuario u = new Usuario();
        u.setNombre(JOptionPane.showInputDialog("Nombre:"));
        u.setApellidos(JOptionPane.showInputDialog("Apellidos:"));
        u.setNickname(JOptionPane.showInputDialog("Usuario (nickname):"));
        u.setPassword(JOptionPane.showInputDialog("Contraseña:"));

        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setElemento(u);
        nuevo.setSiguiente(cima);
        cima = nuevo;

        JOptionPane.showMessageDialog(null, "\n------✶------\nUsuario agregado.\n------✶------\n");
    }

    public void desapilarUsuario() {
        if (!esVacia()) {
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "\n------✶------\nUsuario eliminado.\n------✶------\n");
        } else {
            JOptionPane.showMessageDialog(null, "\n------✶------\nNo se puede mostrar los usuarios, la pila está vacía.\n------✶------\n");
        }
    }

    // mostrar todos los usuarios (desde el último al primero agregado)
    public void mostrarUsuarios() {

        if (!esVacia()) {

            String s = "";
            NodoUsuario aux = cima;
            while (aux != null) {
                s += "\n----------------✶-----------------\n" + aux.getElemento().getNombre() + "\n"
                        + aux.getElemento().getApellidos() + "\n"
                        + aux.getElemento().getNickname() + "\n"
                        + (aux.getElemento().isActivo() ? "Activo" : "Inactivo");
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Usuarios en la pila:\n\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "\n------✶------\nNo se puede mostrar los usuarios, la pila está vacía.\n------✶------\n");
        }
    }

    public void inactivarUsuario() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "\n------✶------\nNo se puede inactivar usuarios, la pila está vacía.\n------✶------\n");
            return;
        }

        String nickname = JOptionPane.showInputDialog("Ingrese el usuario (nickname) a inactivar:");
        NodoUsuario aux = cima;

        while (aux != null) {
            if (aux.getElemento().getNickname().equals(nickname)) {
                aux.getElemento().setActivo(false);
                JOptionPane.showMessageDialog(null, "\n------✶------\nUsuario inactivado.\n------✶------\n");
                return;
            }
            aux = aux.getSiguiente();
        }

        JOptionPane.showMessageDialog(null, "\n------✶------\nUsuario no encontrado\n------✶------\n");
    }
}
