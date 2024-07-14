package com.Aluracursos.cheapNetflix.calculos;

public class Recomendación {
    
    void filtro(Clasificacion clasificacion){
        if(clasificacion.getClasificacion()>=4){
            System.out.println("lo mas visto del momento");
        } else if (clasificacion.getClasificacion()>=2) {
            System.out.println("popular en el momento");
        }else{
            System.out.println("añadelo a tu lista de reproducción");
        }
    }
}
