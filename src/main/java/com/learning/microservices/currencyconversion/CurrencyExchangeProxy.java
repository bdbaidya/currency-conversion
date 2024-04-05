package com.learning.microservices.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_URI:http://localhost}:8088")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{fromcurr}/to/{tocurr}")
	public CurrencyConversion retriveExchangeValue(
			@PathVariable String fromcurr,
			@PathVariable String tocurr );

}
