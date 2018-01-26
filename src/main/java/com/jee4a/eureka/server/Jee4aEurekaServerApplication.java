package com.jee4a.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Jee4aEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jee4aEurekaServerApplication.class, args);
	}
}
