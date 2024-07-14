package com.Aluracursos.cheapNetflix.modelos;

import com.Aluracursos.cheapNetflix.calculos.Clasificacion;

public class Capitulos implements Clasificacion {

    private int numero;
    private String nombrre;
    private String serie;
    private int totalVistas;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombrre() {
        return nombrre;
    }

    public void setNombrre(String nombrre) {
        this.nombrre = nombrre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalVistas>100){
            return 4;
        }else{
            return 2;
        }
    }
}
