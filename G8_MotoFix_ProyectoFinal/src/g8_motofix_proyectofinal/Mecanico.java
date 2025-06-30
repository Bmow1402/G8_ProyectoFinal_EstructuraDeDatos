package g8_motofix_proyectofinal;

//esta clase hereda de usuario
public class Mecanico extends Usuario {

    private String especialidad;
    private int experiencia;

    public Mecanico() {
        super();
        this.especialidad = "";
        this.experiencia = 0;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()
                + "Especialidad: " + especialidad + "\n"
                + "Años de experiencia: " + experiencia + "\n";
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
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
