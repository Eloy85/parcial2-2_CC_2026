public class GestorTaller {

    public Taller cargarDatosIniciales() {

        Taller taller = new Taller("Taller Central");

        // VEHÍCULOS

        Vehiculo v1 = new Vehiculo(
            "AB123CD",
            "Ford",
            "Focus",
            2009,
            "Carlos Gomez"
        );

        Vehiculo v2 = new Vehiculo(
            "AC456EF",
            "Toyota",
            "Corolla",
            2018,
            "Maria Lopez"
        );

        Vehiculo v3 = new Vehiculo(
            "AD789GH",
            "Volkswagen",
            "Gol",
            2007,
            "Juan Perez"
        );

        Vehiculo v4 = new Vehiculo(
            "AE321JK",
            "Chevrolet",
            "Cruze",
            2021,
            "Laura Diaz"
        );


        // MECÁNICOS

        Mecanico m1 = new Mecanico(
            101,
            "Juan Perez",
            "Mecanica general"
        );

        Mecanico m2 = new Mecanico(
            108,
            "Martin Lopez",
            "Electricidad"
        );

        Mecanico m3 = new Mecanico(
            115,
            "Pedro Gomez",
            "Frenos"
        );

        Mecanico m4 = new Mecanico(
            120,
            "Sofia Torres",
            "Inyeccion"
        );


        // REPUESTOS

        Repuesto r1 = new Repuesto(
            1,
            "Bujia",
            8000
        );

        Repuesto r2 = new Repuesto(
            2,
            "Filtro de aceite",
            12000
        );

        Repuesto r3 = new Repuesto(
            3,
            "Correa",
            35000
        );

        Repuesto r4 = new Repuesto(
            4,
            "Pastilla de freno",
            22000
        );


        // ORDEN 205

        OrdenReparacion o1 =
            new OrdenReparacion(
                205,
                v1,
                "05/10/2026",
                5
            );

        o1.agregarMecanico(m1);
        o1.agregarMecanico(m2);


        // ORDEN 206

        OrdenReparacion o2 =
            new OrdenReparacion(
                206,
                v2,
                "06/10/2026",
                3
            );

        o2.agregarMecanico(m4);


        // ORDEN 207

        OrdenReparacion o3 =
            new OrdenReparacion(
                207,
                v3,
                "07/10/2026",
                6
            );

        o3.agregarMecanico(m1);
        o3.agregarMecanico(m3);


        // ORDEN 208

        OrdenReparacion o4 =
            new OrdenReparacion(
                208,
                v4,
                "08/10/2026",
                2
            );

        o4.agregarMecanico(m2);


        // AGREGAR ÓRDENES AL TALLER

        taller.agregarOrden(o1);
        taller.agregarOrden(o2);
        taller.agregarOrden(o3);
        taller.agregarOrden(o4);

        return taller;
    }
}