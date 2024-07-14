import com.Aluracursos.cheapNetflix.calculos.CalculadoraDeTiempo;
import com.Aluracursos.cheapNetflix.modelos.PELICULA;
import com.Aluracursos.cheapNetflix.modelos.SERIE;

import java.security.spec.RSAOtherPrimeInfo;

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



        SERIE breakinBad = new SERIE();
            breakinBad.setTemporadas(5);
            breakinBad.setCapitulosPorTemporada(12);
            breakinBad.setMinutosPorEpisodio(50);
            breakinBad.setAñoDeLanzamiento(2010);
            breakinBad.setNombre("BRREAKING BAD");

        breakinBad.muestraFichaTecnica();
        System.out.println(breakinBad.getDuracionMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(cars);
        System.out.println(calculadora.getTiempoTotal());

        calculadora.incluye(breakinBad);
        System.out.println(calculadora.getTiempoTotal());







    }
}
