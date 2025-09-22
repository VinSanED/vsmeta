package com.vinsan.vsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinsan.vsmeta.etities.Sale;
import com.vinsan.vsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;
	
	public List<Sale> findSales() {	
		return repo.findAll();
	}
}
