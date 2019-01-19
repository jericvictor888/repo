/**
 * To access common actuator endpoints. 
 * By default some endpoints are disabled and must be enabled via application.properties
 * $curl locahost:port/health
 * $curl locahost:port/info
 * $curl locahost:port/metrics
 * $curl locahost:port/trace
 */

package com.echo.SpringActuatorDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorDemoApplication.class, args);
	}

}

