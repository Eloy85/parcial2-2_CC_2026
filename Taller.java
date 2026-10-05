import java.util.ArrayList;

public class Taller {

    private String nombre;
    private ArrayList<OrdenReparacion> ordenes;

    public Taller(String nombre) {
        this.nombre = nombre;
        this.ordenes = new ArrayList<OrdenReparacion>();
    }

    public void agregarOrden(OrdenReparacion orden) {
        ordenes.add(orden);
    }

    public OrdenReparacion buscarOrden(int numero) {

        // COMPLETAR

        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<OrdenReparacion> getOrdenes() {
        return ordenes;
    }
}