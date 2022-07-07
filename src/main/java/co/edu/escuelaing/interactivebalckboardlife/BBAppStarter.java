/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.interactivebalckboardlife;


import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de ejecución de la applicación.
 * @author Luis Daniel Benavides Navarro.
 */
@SpringBootApplication
public class BBAppStarter {
    /**
     * Ejecutador de Spring Boot.
     * @param args
     */
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(BBAppStarter.class);
        
        app.setDefaultProperties(Collections
          .singletonMap("server.port", getPort()));
        app.run(args);
    }
    /**
     * Genera el puerto con el cual se ejecuta la app.
     * @return numero de puerto.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
