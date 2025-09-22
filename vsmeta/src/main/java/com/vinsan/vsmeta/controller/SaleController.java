package com.vinsan.vsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinsan.vsmeta.etities.Sale;
import com.vinsan.vsmeta.services.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	@Autowired
	private SaleService serv;
	
	@GetMapping
	public List<Sale> findSales() {
		return serv.findSales();
	}
}
