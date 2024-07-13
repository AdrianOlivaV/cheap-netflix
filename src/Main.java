import com.Aluracursos.cheapNetflix.modelos.PELICULA;

public class Main {
    public static void main(String[] args) {
        PELICULA cars = new PELICULA();
        cars.setNombre("Cars");
        cars.setAñoDeLanzamiento(2006);
        cars.setDuracionMinutos(120);
        cars.setIncluidoEnPlan(true);

        cars.muestraFichaTecnica();
        cars.evalua(10);
        cars.evalua(7);
        cars.evalua(9);
        System.out.println(cars.getNumeroDeEvaluaciones());
        System.out.println(cars.calculaNotaMedia());

    }
}
