package com.example.anthony.prueba2;

/**
 * Created by Anthony on 13/09/2017.
 */

public class DatosDefecto {

    Datos global = Datos.getInstance();

    public DatosDefecto() {
    }

    public void datosLugares(){
        Lugar l1 = new Lugar(1,"lugar1", "descripcion1", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l2 = new Lugar(2,"lugar2", "descripcion2", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l3 = new Lugar(3,"lugar3", "descripcion3", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l4 = new Lugar(4,"lugar4", "descripcion4", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l5 = new Lugar(5,"lugar5", "descripcion5", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l6 = new Lugar(1,"lugar1", "descripcion1", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l7 = new Lugar(2,"lugar2", "descripcion2", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l8 = new Lugar(3,"lugar3", "descripcion3", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l9 = new Lugar(4,"lugar4", "descripcion4", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l10 = new Lugar(5,"lugar5", "descripcion5", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l11 = new Lugar(1,"lugar1", "descripcion1", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l12 = new Lugar(2,"lugar2", "descripcion2", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l13 = new Lugar(3,"lugar3", "descripcion3", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l14 = new Lugar(4,"lugar4", "descripcion4", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");
        Lugar l15 = new Lugar(5,"lugar5", "descripcion5", 500, "L-D-7-4", "direccion1", "8444-5555", "comentario1");

        global.addListaLugares(l1);
        global.addListaLugares(l2);
        global.addListaLugares(l3);
        global.addListaLugares(l4);
        global.addListaLugares(l5);
        global.addListaLugares(l6);
        global.addListaLugares(l7);
        global.addListaLugares(l8);
        global.addListaLugares(l9);
        global.addListaLugares(l10);
        global.addListaLugares(l11);
        global.addListaLugares(l12);
        global.addListaLugares(l13);
        global.addListaLugares(l14);
        global.addListaLugares(l15);


    }
}
