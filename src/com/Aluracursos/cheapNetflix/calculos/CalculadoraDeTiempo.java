package com.Aluracursos.cheapNetflix.calculos;

import com.Aluracursos.cheapNetflix.modelos.PELICULA;
import com.Aluracursos.cheapNetflix.modelos.SERIE;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(PELICULA pelicula){
        tiempoTotal+=pelicula.getDuracionMinutos();
    }

    public void incluye(SERIE serie){
        tiempoTotal+=serie.getDuracionMinutos();
    }


}
