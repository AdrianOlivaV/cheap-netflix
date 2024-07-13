public class Main {
    public static void main(String[] args) {
        PELICULA cars = new PELICULA();
        cars.Nombre="Cars";
        cars.añoDeLanzamiento=2005;
        cars.duracionMinutos=120;

        cars.muestraFichaTecnica();
        cars.evalua(10);
        cars.evalua(7);
        cars.evalua(9);
        System.out.println(cars.sumaEvaluaciones);
        System.out.println(cars.numeroDeEvaluaciones);
        System.out.println(cars.calculaNotaMedia());


        System.out.println("\n");

        PELICULA matrix = new PELICULA();
        matrix.Nombre="Matrix";
        matrix.añoDeLanzamiento=1999;
        matrix.duracionMinutos=129;

        //matrix.muestraFichaTecnica();
    }
}
