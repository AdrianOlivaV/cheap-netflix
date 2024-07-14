package com.Aluracursos.cheapNetflix.Principal;

import com.Aluracursos.cheapNetflix.modelos.Titulo;
import com.Aluracursos.cheapNetflix.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        System.out.println(miTituloOMDB);
        Titulo miTitulo = new Titulo(miTituloOMDB);





    }
}
