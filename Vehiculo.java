public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private int anio;
    private String propietario;

    public Vehiculo(String patente, String marca, String modelo,
                    int anio, String propietario) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.propietario = propietario;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getPropietario() {
        return propietario;
    }
}