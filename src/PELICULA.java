public class PELICULA {

    String Nombre;
    int añoDeLanzamiento;
    boolean incluidoEnPlan;
    int duracionMinutos;
    double sumaEvaluaciones;
    int numeroDeEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("titulo de la pelicula: "+Nombre);
        System.out.println("Año de lanzamiento: "+añoDeLanzamiento);
        System.out.println("Duración en minutos: "+duracionMinutos);
    }


    void evalua(double nota){
        sumaEvaluaciones+=nota;
        numeroDeEvaluaciones++;
    }

    double calculaNotaMedia(){
        return sumaEvaluaciones/numeroDeEvaluaciones;
    }
}

