package fr.zaragoza.discoserveur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoServeurApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoServeurApplication.class, args);
	}

}
