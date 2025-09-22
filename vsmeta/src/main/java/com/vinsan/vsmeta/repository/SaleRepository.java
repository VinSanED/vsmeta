package com.vinsan.vsmeta.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinsan.vsmeta.etities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findWithDate(LocalDate min, LocalDate max, Pageable page);
}
