package com.example.NetflixEurekaServerUdacityProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaServerUdacityProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaServerUdacityProjectApplication.class, args);
	}

}
