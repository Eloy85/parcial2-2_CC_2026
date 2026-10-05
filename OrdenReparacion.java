import java.util.ArrayList;

public class OrdenReparacion {

    private int numero;
    private Vehiculo vehiculo;
    private String fechaIngreso;
    private int horasTrabajo;
    private ArrayList<Mecanico> mecanicos;

    public OrdenReparacion(int numero, Vehiculo vehiculo,
                           String fechaIngreso, int horasTrabajo) {

        this.numero = numero;
        this.vehiculo = vehiculo;
        this.fechaIngreso = fechaIngreso;
        this.horasTrabajo = horasTrabajo;
        this.mecanicos = new ArrayList<Mecanico>();
    }

    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    public int getNumero() {
        return numero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }
}