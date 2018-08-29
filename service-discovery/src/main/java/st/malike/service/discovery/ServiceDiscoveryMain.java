/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

/**
 * @author malike_st
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryMain {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ApplicationContext context = SpringApplication.run(ServiceDiscoveryMain.class, args);
    }


}