package g8_motofix_proyectofinal;

import javax.swing.JOptionPane;

public class GestorUsuarios {

    private NodoUsuario cima;

    public GestorUsuarios() {
        this.cima = null;
    }

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    // Métodos para agregar usuario
    public void agregarCliente() {
        Cliente c = new Cliente();
        c.setNombre(JOptionPane.showInputDialog("Nombre del cliente:"));
        c.setApellidos(JOptionPane.showInputDialog("Apellidos:"));
        c.setNickname(JOptionPane.showInputDialog("Usuario (nickname):"));
        c.setCiudad(JOptionPane.showInputDialog("Ciudad:"));
        c.setDireccion(JOptionPane.showInputDialog("Dirección:"));
        c.setTelefono(JOptionPane.showInputDialog("Teléfono:"));
        c.setCorreo(JOptionPane.showInputDialog("Correo:"));
        c.setTipo("Cliente");

        apilar(c);
        JOptionPane.showMessageDialog(null, "Cliente agregado.");
    }

    public void agregarMecanico() {
        Mecanico m = new Mecanico();
        m.setNombre(JOptionPane.showInputDialog("Nombre del mecánico:"));
        m.setApellidos(JOptionPane.showInputDialog("Apellidos:"));
        m.setNickname(JOptionPane.showInputDialog("Usuario (nickname):"));
        m.setEspecialidad(JOptionPane.showInputDialog("Especialidad:"));
        m.setExperiencia(Integer.parseInt(JOptionPane.showInputDialog("Años de experiencia:")));
        m.setTipo("Mecanico");

        apilar(m);
        JOptionPane.showMessageDialog(null, "Mecánico agregado.");
    }

    public void agregarAdmin() {
        Admin a = new Admin();
        a.setNombre(JOptionPane.showInputDialog("Nombre del admin:"));
        a.setApellidos(JOptionPane.showInputDialog("Apellidos:"));
        a.setNickname(JOptionPane.showInputDialog("Usuario (nickname):"));
        a.setPuesto(JOptionPane.showInputDialog("Puesto:"));
        a.setTipo("Admin");

        apilar(a);
        JOptionPane.showMessageDialog(null, "Administrador agregado.");
    }

    private void apilar(Usuario u) {
        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setElemento(u);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    // Método para mostrar usuarios de un tipo específico
    public void mostrarUsuariosPorTipo(String tipoBuscado) {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
            return;
        }

        NodoUsuario aux = cima;
        String resultado = "";

        while (aux != null) {
            if (aux.getElemento().getTipo().equals(tipoBuscado)) {
                resultado += "\n------------------------\n";
                resultado += aux.getElemento().mostrarInfo();
            }
            aux = aux.getSiguiente();
        }

        if (resultado.length() > 0) {
            JOptionPane.showMessageDialog(null, "Usuarios:\n" + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios del tipo: " + tipoBuscado);
        }
    }

    public void inactivarUsuario() {
        String nick = JOptionPane.showInputDialog("Ingrese el nickname del usuario a inactivar: ");

        if (nick == null || nick.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lo siento, debe ingresar un nickname válido");
            return;
        }

        NodoUsuario aux = cima;
        boolean encontrado = false;

        while (aux != null) {
            if (nick.equals(aux.getElemento().getNickname())) {
                if (!aux.getElemento().isActivo()) {
                    JOptionPane.showMessageDialog(null, "Ups, parece que el usuario ya está inactivo");
                    return;
                }

                // testeo de datos existentess
                //if (tieneDatosRelacionados(aux.getElemento())) {
                //     JOptionPane.showMessageDialog(null, "No se puede inactivar el usuario porque tiene datos relacionados.");
                //     return;
                // }
                
                aux.getElemento().setActivo(false);
                JOptionPane.showMessageDialog(null, "Usuario inactivado.");
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }
    }

}
