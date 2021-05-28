package com.neosoft.POC9.temperatureconversionservice;

import java.math.BigDecimal;

public class TemperatureConversion {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversion;
	private BigDecimal value;
	private BigDecimal calculatedValue;
	private String environment;
	
	public TemperatureConversion() {
		super();
	}

	public TemperatureConversion(Long id, String from, String to, BigDecimal conversion, BigDecimal value,
			BigDecimal calculatedValue, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion = conversion;
		this.value = value;
		this.calculatedValue = calculatedValue;
		this.environment = environment;
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

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getCalculatedValue() {
		return calculatedValue;
	}

	public void setCalculatedValue(BigDecimal calculatedValue) {
		this.calculatedValue = calculatedValue;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	

}
