package com.Aluracursos.cheapNetflix.modelos;

public class PELICULA {

    private String Nombre;
    private int añoDeLanzamiento;
    private boolean incluidoEnPlan;
    private int duracionMinutos;
    private double sumaEvaluaciones;
    private int numeroDeEvaluaciones;


    public int getNumeroDeEvaluaciones(){
        return numeroDeEvaluaciones;
    }


    public void muestraFichaTecnica(){
        System.out.println("titulo de la pelicula: "+Nombre);
        System.out.println("Año de lanzamiento: "+añoDeLanzamiento);
        System.out.println("Duración en minutos: "+duracionMinutos);
    }


    public void evalua(double nota){
        sumaEvaluaciones+=nota;
        numeroDeEvaluaciones++;
    }

    public double calculaNotaMedia(){
        return sumaEvaluaciones/numeroDeEvaluaciones;
    }
}

