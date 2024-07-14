package com.Aluracursos.cheapNetflix.calculos;

import com.Aluracursos.cheapNetflix.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal+=titulo.getDuracionMinutos();
    }




}
