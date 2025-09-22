package com.vinsan.vsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinsan.vsmeta.etities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
