package g8_motofix_proyectofinal;

public class NodoUsuario {

    public Usuario elemento;
    public NodoUsuario siguiente;

    public NodoUsuario() {
        this.siguiente = null;
    }

    public Usuario getElemento() {
        return elemento;
    }

    public void setElemento(Usuario elemento) {
        this.elemento = elemento;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

}
