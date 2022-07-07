/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.interactivebalckboardlife.webconfigurator;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * Clase que especfica las direcciones de las paginas.
 * @author Luis Daniel Benavides Navarro.
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
        /**
         * Identifica las direcciones dentro de la App.
         */
        @Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/bb2").setViewName("bb2");
		registry.addViewController("/login").setViewName("login");
	}

}