package com.Aluracursos.cheapNetflix.modelos;

import com.Aluracursos.cheapNetflix.calculos.Clasificacion;

public class PELICULA extends TITULO implements Clasificacion {
    private String Director;

    public PELICULA(String nombre) {
        this.setNombre(nombre);
    }

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

    @Override
    public String toString() {
        return "Pelicula: "+this.getNombre()+"("+getAñoDeLanzamiento()+")";
    }
}

