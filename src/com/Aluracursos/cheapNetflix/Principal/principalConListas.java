package com.Aluracursos.cheapNetflix.Principal;
import com.Aluracursos.cheapNetflix.modelos.TITULO;
import com.Aluracursos.cheapNetflix.modelos.PELICULA;
import com.Aluracursos.cheapNetflix.modelos.SERIE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class principalConListas {
    public static void main(String[] args) {


        PELICULA cars = new PELICULA("Cars",2006);
        cars.evalua(9);
        PELICULA matrix = new PELICULA("matrix",1999);
        matrix.evalua(6);
        var peliDeBruno = new PELICULA("señor de los anillos",2001);
        peliDeBruno.evalua(10);
        SERIE breakinBad = new SERIE("BRREAKING BAD",2010);


        ArrayList<TITULO> lista=new ArrayList<>();
        lista.add(cars);
        lista.add(matrix);
        lista.add(peliDeBruno);
        lista.add(breakinBad);


        for (TITULO item: lista){
            System.out.println(item.getNombre());
            if(item instanceof PELICULA pelicula && pelicula.getClasificacion()>=5){
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("lista de artistas ordenada " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista de titulos ordenados "+ lista);

        lista.sort(Comparator.comparing(TITULO::getAñoDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);



    }
}
