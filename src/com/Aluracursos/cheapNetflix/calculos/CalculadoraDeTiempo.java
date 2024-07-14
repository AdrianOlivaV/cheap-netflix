package com.Aluracursos.cheapNetflix.calculos;

import com.Aluracursos.cheapNetflix.modelos.PELICULA;
import com.Aluracursos.cheapNetflix.modelos.SERIE;
import com.Aluracursos.cheapNetflix.modelos.TITULO;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(TITULO titulo){
        this.tiempoTotal+=titulo.getDuracionMinutos();
    }




}
