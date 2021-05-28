package com.neosoft.POC9.temperatureexchangeservice;

import java.math.BigDecimal;

public class TemperatureExchange {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversion;
	private String environment;
	
	
	
	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public TemperatureExchange() {
		super();
	}

	public TemperatureExchange(Long id, String from, String to, BigDecimal conversion) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion = conversion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversion() {
		return conversion;
	}

	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}

	
	
	
	
	

}
