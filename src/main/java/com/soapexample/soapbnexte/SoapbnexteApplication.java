package com.soapexample.soapbnexte;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
 

 @SpringBootApplication
public class SoapbnexteApplication {
  
	public static void main(String[] args) {
		SpringApplication.run(SoapbnexteApplication.class, args);
	}
@Bean
	public GroupedOpenApi myApi() {
		return GroupedOpenApi.builder()
			.group("Servicio soap Generico Example Entidad Externa")
			.pathsToMatch("/**"  )
			.build();
	}
}
