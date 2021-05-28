package com.neosoft.POC9.temperatureconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TemperatureConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureConversionServiceApplication.class, args);
	}

}
