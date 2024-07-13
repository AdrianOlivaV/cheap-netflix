public class Main {
    public static void main(String[] args) {
        PELICULA cars = new PELICULA();
        cars.Nombre="Cars";
        cars.añoDeLanzamiento=2005;
        cars.duracionMinutos=120;

        cars.muestraFichaTeccnica();

        System.out.println("\n");

        PELICULA matrix = new PELICULA();
        matrix.Nombre="Matrix";
        matrix.añoDeLanzamiento=1999;
        matrix.duracionMinutos=129;

        System.out.println("titulo de la pelicula: "+matrix.Nombre);
        System.out.println("Año de lanzamiento: "+matrix.añoDeLanzamiento);
    }
}
