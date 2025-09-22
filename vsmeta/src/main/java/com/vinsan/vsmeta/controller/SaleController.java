package com.vinsan.vsmeta.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinsan.vsmeta.etities.Sale;
import com.vinsan.vsmeta.services.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	@Autowired
	private SaleService serv;
	
	@GetMapping
	public Page<Sale> findSales(Pageable page) {
		return serv.findSales(page);
	}
	
	@GetMapping(value="/dates")
	public Page<Sale> findSalesWithDate(
			@RequestParam(value="minDate", defaultValue="") String minDate,
			@RequestParam(value="maxDate", defaultValue="") String maxDate,
			Pageable page) {
		return serv.findSalesWithDate(minDate, maxDate, page);
	}
}
