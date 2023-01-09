package com.inatel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inatel.model.StockQuote;
import com.inatel.repository.StockQuoteRepository;

@Service
public class QuoteService {

    @Autowired
    StockQuoteRepository repository;

    @Autowired
    StockService stockService;

    public StockQuote save(StockQuote stockQuote) throws Exception  {

        if (!stockService.isStockValido(stockQuote.getStockId())) {
            throw new Exception("nao existe stock");
        }

        return repository.save(stockQuote);
    }



    
}
