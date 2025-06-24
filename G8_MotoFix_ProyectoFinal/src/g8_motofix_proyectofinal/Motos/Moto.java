package g8_motofix_proyectofinal.Motos;

public class Moto {

    public String marca;
    public String dueno; //--> jalar los datos del dueno
    public int anio;
    public int placa;
    public int modelo;
    public boolean activo;

    public Moto() {
        this.marca = "";
        this.dueno = "";
        this.anio = 0;
        this.placa = 0;
        this.modelo = 0;
        this.activo = true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

}
