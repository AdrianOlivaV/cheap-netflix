package com.Aluracursos.cheapNetflix.Principal;

import com.Aluracursos.cheapNetflix.modelos.Titulo;
import com.Aluracursos.cheapNetflix.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonToken;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBuqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("escriba el nombre de la pelicula:");
        var busqueda = teclado.nextLine();


        String direccion ="https://www.omdbapi.com/?t="+busqueda+"&apikey=6c691c59";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json= response.body();
            System.out.println(json);
//
//        Lo que es una API y su funcionamiento básico;
//        Cómo funciona la API de OMDb para buscar películas;
//        Realizar una consulta en la API de OMDb usando Postman;
//        Cómo integrarse con la API de OMDb en Java, utilizando las clases HttpClient, HttpRequest y HttpResponse.

            Gson gson=new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            //Gson gson=new Gson();
            TituloOMDB miTituloOMDB = gson.fromJson(json, TituloOMDB.class);

            Titulo miTitulo = new Titulo(miTituloOMDB);
            System.out.println("titulo ya convertido: "+miTituloOMDB);
        } catch (NumberFormatException e){
            System.out.println("ocurrio un error: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Error en la URI, verifique la direccion ");
        }catch (Exception e){
            System.out.println("ocurrio un error inesperado");
        }
        System.out.println("finalizo la ejecucion del programa");


//        Lo que aprendimos en esta aula:
//
//        Lo que son las bibliotecas de Java;
//        Cómo instalar la biblioteca Gson en el proyecto, descargando y configurando su archivo jar;
//        A usar la biblioteca Gson para convertir json en un objeto Java;
//        Cómo crear un Record en Java, que es una estructura similar a una clase, pero utilizada solo para representar datos;
//        A flexibilizar la conversión de un json en un objeto Java, siguiendo la documentación de la biblioteca Gson.



    }
}
