package com.matheusfvp.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusfvp.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
