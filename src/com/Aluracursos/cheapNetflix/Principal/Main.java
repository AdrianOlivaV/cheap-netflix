package com.Aluracursos.cheapNetflix.Principal;

import com.Aluracursos.cheapNetflix.calculos.CalculadoraDeTiempo;
import com.Aluracursos.cheapNetflix.calculos.Recomendación;
import com.Aluracursos.cheapNetflix.modelos.Capitulos;
import com.Aluracursos.cheapNetflix.modelos.PELICULA;
import com.Aluracursos.cheapNetflix.modelos.SERIE;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PELICULA cars = new PELICULA("Cars",2006);
            cars.setDuracionMinutos(120);
            cars.setIncluidoEnPlan(true);
            cars.muestraFichaTecnica();
        cars.evalua(10);
        cars.evalua(7);
        cars.evalua(9);
        System.out.println(cars.getNumeroDeEvaluaciones());
        System.out.println(cars.calculaNotaMedia());



        SERIE breakinBad = new SERIE("BRREAKING BAD",2010);
            breakinBad.setTemporadas(5);
            breakinBad.setCapitulosPorTemporada(12);
            breakinBad.setMinutosPorEpisodio(50);
            breakinBad.muestraFichaTecnica();

        PELICULA matrix = new PELICULA("matrix",1999);

            matrix.setDuracionMinutos(180);
            matrix.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
            calculadora.incluye(cars);
            calculadora.incluye(breakinBad);
            calculadora.incluye(matrix);
        System.out.println(calculadora.getTiempoTotal());

        Recomendación filtroRecomendacion = new Recomendación();
        filtroRecomendacion.filtro(cars);

        Capitulos episodio = new Capitulos();
        episodio.setNumero(1);
        episodio.setNombrre("cola");
        episodio.setSerie("breaking bad");
        episodio.setTotalVistas(2500);
        filtroRecomendacion.filtro(episodio);


        //trabajando con arraylist

            var peliDeBruno = new PELICULA("señor de los anillos",2001);
            peliDeBruno.setDuracionMinutos(180);

        ArrayList<PELICULA> listaDePeliculas=new ArrayList<>();
        listaDePeliculas.add(cars);
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(peliDeBruno);

        System.out.println("tamaño de la lista: "+ listaDePeliculas.size());
        System.out.println("la primera pelicula de la lista es: "+listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula: "+listaDePeliculas.get(0).toString());




    }
}
