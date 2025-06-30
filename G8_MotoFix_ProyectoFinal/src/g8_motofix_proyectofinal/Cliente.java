package g8_motofix_proyectofinal;

public class Cliente extends Usuario {

    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;

    public Cliente() {
        super();
        this.ciudad = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()
                + "Ciudad: " + ciudad + "\n"
                + "Dirección: " + direccion + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Correo electrónico: " + correo + "\n";
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
