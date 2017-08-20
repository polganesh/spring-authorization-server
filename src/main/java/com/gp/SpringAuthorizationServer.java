/**
 * 
 */
package com.gp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author GANESH
 *
 */
@SpringBootApplication
@EnableAuthorizationServer
public class SpringAuthorizationServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringAuthorizationServer.class, args);

	}

}
