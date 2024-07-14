package com.Aluracursos.cheapNetflix.Principal;
import com.Aluracursos.cheapNetflix.modelos.TITULO;
import com.Aluracursos.cheapNetflix.modelos.PELICULA;
import com.Aluracursos.cheapNetflix.modelos.SERIE;

import java.util.ArrayList;

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
            PELICULA pelicula =(PELICULA) item;
            System.out.println(pelicula.getClasificacion());
        }
    }
}
