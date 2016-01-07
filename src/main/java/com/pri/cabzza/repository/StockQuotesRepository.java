package com.pri.cabzza.repository;

import com.pri.cabzza.domain.StockQuotes;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the StockQuotes entity.
 */
public interface StockQuotesRepository extends JpaRepository<StockQuotes,Long> {

}