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

    public void apilarCliente() {
        Cliente c = new Cliente();
        c.setNombre(JOptionPane.showInputDialog("Nombre:"));
        c.setApellidos(JOptionPane.showInputDialog("Apellidos:"));
        c.setNickname(JOptionPane.showInputDialog("Usuario (nickname):"));
        c.setCiudad(JOptionPane.showInputDialog("Ciudad:"));
        c.setDireccion(JOptionPane.showInputDialog("Dirección:"));
        c.setTelefono(JOptionPane.showInputDialog("Teléfono:"));
        c.setCorreo(JOptionPane.showInputDialog("Correo electrónico:"));
        c.setTipo("Cliente"); //tipo de usuario

        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setElemento(c);
        nuevo.setSiguiente(cima);
        cima = nuevo;

        JOptionPane.showMessageDialog(null, "\n------✶------\nCliente agregado.\n------✶------\n");
    }

    public void apilarMecanico() {
        Mecanico m = new Mecanico();
        m.setNombre(JOptionPane.showInputDialog("Nombre del mecánico:"));
        m.setApellidos(JOptionPane.showInputDialog("Apellidos del mecánico:"));
        m.setNickname(JOptionPane.showInputDialog("Usuario (nickname):"));
        m.setEspecialidad(JOptionPane.showInputDialog("Especialidad:"));
        m.setExperiencia(Integer.parseInt(JOptionPane.showInputDialog("Años de experiencia:")));
        m.setTipo("Mecanico"); // tipo de usuario

        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setElemento(m);
        nuevo.setSiguiente(cima);
        cima = nuevo;

        JOptionPane.showMessageDialog(null, "\n------✶------\nMecanico agregado.\n------✶------\n.");
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
                s += "\n----------------✶-----------------\n"
                        + "Tipo de usuario: " + aux.getElemento().getTipo() + "\n"
                        + aux.getElemento().getNombre() + "\n"
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

    public void mostrarMecanicos() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "\n------✶------\nNo hay usuarios en la pila.\n------✶------\n");
            return;
        }

        String s = "";
        NodoUsuario aux = cima;

        while (aux != null) {
            Usuario u = aux.getElemento();

            // Verifica si el objeto es instancia de Mecanico
            if (u instanceof Mecanico) {
                Mecanico m = (Mecanico) u;
                s += "\n----------------✶-----------------\n";
                s += "Nombre: " + m.getNombre() + " " + m.getApellidos() + "\n";
                s += "Nickname: " + m.getNickname() + "\n";
                s += "Especialidad: " + m.getEspecialidad() + "\n";
                s += "Años de experiencia: " + m.getExperiencia() + "\n";
                s += "Estado: " + (m.isActivo() ? "Activo" : "Inactivo") + "\n";
            }

            aux = aux.getSiguiente();
        }

        if (s==null) {
            JOptionPane.showMessageDialog(null, "No hay mecánicos registrados.");
        } else {
            JOptionPane.showMessageDialog(null, "Lista de Mecánicos:\n" + s);
        }
    }

    public void mostrarClientes() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "\n------✶------\nNo hay usuarios en la pila.\n------✶------\n");
            return;
        }

        String s = "";
        NodoUsuario aux = cima;

        while (aux != null) {
            Usuario u = aux.getElemento();
 
            if (u.getTipo() != null && u.getTipo().equals("Cliente")) {
                s += "\n----------------✶-----------------\n";
                s += "Nombre: " + u.getNombre() + " " + u.getApellidos() + "\n";
                s += "Nickname: " + u.getNickname() + "\n";
                s += "Ciudad: " + u.getNickname() + "\n";
                s += "Direccion: " + u.getNickname() + "\n";
                s += "Correo electronico: " + u.getNickname() + "\n";
                s += "Telefono: " + u.getNickname() + "\n";
                s += "Estado: " + (u.isActivo() ? "Activo" : "Inactivo") + "\n";
            }

            aux = aux.getSiguiente();
        }

        if (s==null) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
        } else {
            JOptionPane.showMessageDialog(null, "Lista de Clientes:\n" + s);
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
