package com.Aluracursos.cheapNetflix.modelos;

public class SERIE extends Titulo {

    private int temporadas;
    private int capitulosPorTemporada;
    private int minutosPorEpisodio;

    public SERIE(String nombre, int añoDeLanzamiento) {
        super(nombre, añoDeLanzamiento);
    }

    @Override
    public int getDuracionMinutos() {
        return temporadas*capitulosPorTemporada*minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCapitulosPorTemporada() {
        return capitulosPorTemporada;
    }

    public void setCapitulosPorTemporada(int capitulosPorTemporada) {
        this.capitulosPorTemporada = capitulosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie " + this.getNombre()+"("+getAñoDeLanzamiento()+")";
    }
}
