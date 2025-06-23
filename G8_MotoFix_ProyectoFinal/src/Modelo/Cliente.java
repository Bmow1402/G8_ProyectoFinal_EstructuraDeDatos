package Modelo;

public class Cliente {

    String nombreCompleto;
    String nickname;
    String password;
    boolean activo; // true = activo, false = inactivo

    public Cliente(String nombreCompleto, String nickname, String password) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.password = password;
        this.activo = true;
    }    

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
   
}
