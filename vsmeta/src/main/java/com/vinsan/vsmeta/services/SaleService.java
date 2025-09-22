package com.vinsan.vsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vinsan.vsmeta.etities.Sale;
import com.vinsan.vsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;
	
	public Page<Sale> findSales(Pageable page) {	
		return repo.findAll(page);
	}
	
	public Page<Sale> findSalesWithDate(String maxDate, String minDate, Pageable page) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate dateMin = minDate.equals("")? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate dateMax = maxDate.equals("")? today : LocalDate.parse(maxDate);

		return repo.findWithDate(dateMax, dateMin, page);
	}
}
