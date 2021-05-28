package com.neosoft.POC9.temperatureconversionservice;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TemperatureConversionController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private TemperatureExchangeProxy proxy;    //creating instance of feign client or injecting feign client
	
	
	@GetMapping("temperature-conversion/from/{from}/to/{to}/value/{value}")
	public TemperatureConversion calculateTemperatureConversion(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal value) {
		
		TemperatureConversion tempConversion = proxy.retrieveExchangeValue(from, to);
		
		BigDecimal q1 = (value.divide(BigDecimal.valueOf(1.8),8, RoundingMode.HALF_UP)).add(tempConversion.getConversion()).subtract(BigDecimal.valueOf((32/1.8)-17.2222));
		BigDecimal q2 = (value.multiply(BigDecimal.valueOf(1.8))).add(tempConversion.getConversion()).subtract(BigDecimal.valueOf(1.8));
		String port = environment.getProperty("local.server.port");
		tempConversion.setEnvironment(port);
		
		MathContext mc = new MathContext(8);
		
		if (from.equals("F") && to.equals("C")) {
			return new TemperatureConversion(tempConversion.getId(),
					from, to, value,
					tempConversion.getConversion(),
					q1.round(mc),
					tempConversion.getEnvironment());
		} else {
			if(from.equals("C") && to.equals("F")) {
			return new TemperatureConversion(tempConversion.getId(),
					from, to, value,
					tempConversion.getConversion(),
					q2.round(mc),
					tempConversion.getEnvironment());
			}
			else {
				throw new RuntimeException("Unable To find data for " +from+ " to "+to);
			}
		}
		
	}
	

}
