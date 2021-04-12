package fr.zaragoza.serviceconverteurmonnaie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceConverteurMonnaieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConverteurMonnaieApplication.class, args);
	}

}
