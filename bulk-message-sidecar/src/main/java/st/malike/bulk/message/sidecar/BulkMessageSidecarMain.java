/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.bulk.message.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.context.ApplicationContext;

/**
 * @author malike_st
 */
@EnableSidecar
@SpringBootApplication
public class BulkMessageSidecarMain {


  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    ApplicationContext context = SpringApplication.run(BulkMessageSidecarMain.class, args);
  }


}