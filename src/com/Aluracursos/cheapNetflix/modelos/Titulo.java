package com.Aluracursos.cheapNetflix.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>  {
    @SerializedName("Title")
    private String Nombre;
    @SerializedName("Year")
    private int añoDeLanzamiento;
    private boolean incluidoEnPlan;
    private int duracionMinutos;
    private double sumaEvaluaciones;
    private int numeroDeEvaluaciones;

    public Titulo(String nombre, int añoDeLanzamiento) {
        this.Nombre = nombre;
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    public Titulo(TituloOMDB miTituloOMDB) {
        this.Nombre = miTituloOMDB.title();
        this.añoDeLanzamiento=Integer.valueOf(miTituloOMDB.year());
        this.duracionMinutos=Integer.valueOf(miTituloOMDB.runtime().substring(0,2));
    }

    public String getNombre() {
        return Nombre;
    }

    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setAñoDeLanzamiento(int añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getNumeroDeEvaluaciones(){
        return numeroDeEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("titulo: "+getNombre());
        System.out.println("Año de lanzamiento: "+getAñoDeLanzamiento());
        System.out.println("Duración en minutos: "+getDuracionMinutos());
    }


    public void evalua(double nota){
        sumaEvaluaciones+=nota;
        numeroDeEvaluaciones++;
    }

    public double calculaNotaMedia(){
        return sumaEvaluaciones/numeroDeEvaluaciones;
    }


    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "Nombre='" + Nombre + '\'' +
                ", añoDeLanzamiento=" + añoDeLanzamiento+
                "Duracion="+duracionMinutos;
    }
}
