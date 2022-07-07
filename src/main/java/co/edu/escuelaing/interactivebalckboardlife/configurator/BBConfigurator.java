package co.edu.escuelaing.interactivebalckboardlife.configurator;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Clase de configuracion del servidor de la app.
 * @author Luis Daniel Benavides Navarro.
 */
@Configuration
public class BBConfigurator {
    /**
     * Exporta el servidor de la app.
     * @return Servidor a exportar.
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}