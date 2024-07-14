package com.Aluracursos.cheapNetflix.modelos;

import com.Aluracursos.cheapNetflix.calculos.Clasificacion;

public class PELICULA extends TITULO implements Clasificacion {
    private String Director;

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        this.Director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaNotaMedia()/2);
    }
}

