package com.learning.microservices.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableFeignClients
@EnableZipkinServer
public class CurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionApplication.class, args);
	}

}
