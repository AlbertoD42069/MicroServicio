package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TiburonesServiciosRestApplication {


	public static void main(String[] args) {
		SpringApplication.run(TiburonesServiciosRestApplication.class, args);
	}
}
