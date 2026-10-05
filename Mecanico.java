public class Mecanico {

    private int legajo;
    private String nombre;
    private String especialidad;

    public Mecanico(int legajo, String nombre, String especialidad) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}