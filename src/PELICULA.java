public class PELICULA {

    String Nombre;
    int añoDeLanzamiento;
    boolean incluidoEnPlan;
    int duracionMinutos;

    void muestraFichaTeccnica(){
        System.out.println("titulo de la pelicula: "+Nombre);
        System.out.println("Año de lanzamiento: "+añoDeLanzamiento);
        System.out.println("Duración en minutos: "+duracionMinutos);
    }

}

