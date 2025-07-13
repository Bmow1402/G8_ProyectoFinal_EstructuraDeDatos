package g8_motofix_proyectofinal;

public class Moto {

    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private String nombreCliente;
    private int telefono;
    private boolean estado;

    public Moto() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.anio = 0;
        this.nombreCliente = "";
        this.telefono = 0;
        this.estado = true;
    }
    
    public String mostrarInfo() {
        return "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio +
               "\nCliente: " + nombreCliente + "\nTeléfono: " + telefono +
               "\nEstado: " + (estado ? "Activa" : "Inactiva");
    }

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
  
    
}
