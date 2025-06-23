package g8_motofix_proyectofinal.Usuarios;

public class Usuario {

    public String nombre;
    public String apellidos;
    public String nickname;
    public String password;
    public boolean activo;

    public Usuario() {
        this.nombre = "";
        this.apellidos = "";
        this.nickname = "";
        this.password = "";
        this.activo =  true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
