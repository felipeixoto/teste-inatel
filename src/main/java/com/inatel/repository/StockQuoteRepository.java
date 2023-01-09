package com.inatel.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inatel.model.StockQuote;

@Repository
public interface StockQuoteRepository extends JpaRepository<StockQuote, UUID> {
    
    StockQuote findByStockId(String stockId);
}
