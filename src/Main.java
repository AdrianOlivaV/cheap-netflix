import com.Aluracursos.cheapNetflix.modelos.PELICULA;

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
        System.out.println(cars.getNumeroDeEvaluaciones());
        System.out.println(cars.calculaNotaMedia());

    }
}
