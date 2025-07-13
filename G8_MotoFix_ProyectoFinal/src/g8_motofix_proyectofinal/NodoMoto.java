package g8_motofix_proyectofinal;

public class NodoMoto {
    
    public Moto inicio;
    public NodoMoto fin;

    public NodoMoto() {
        this.inicio = null;
        this.fin = null;
    }

    public Moto getInicio() {
        return inicio;
    }

    public void setInicio(Moto inicio) {
        this.inicio = inicio;
    }

    public NodoMoto getFin() {
        return fin;
    }

    public void setFin(NodoMoto fin) {
        this.fin = fin;
    }
 
}
