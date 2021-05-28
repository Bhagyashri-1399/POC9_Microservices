package com.neosoft.POC9.temperatureconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "temperature-exchange")
public interface TemperatureExchangeProxy {     //To send HTTP Request to a destination microservice
	
	@GetMapping("/temperature-exchange/from/{from}/to/{to}")
	public TemperatureConversion retrieveExchangeValue(
			@PathVariable("from") String from,
			@PathVariable("to") String to
			);

}
