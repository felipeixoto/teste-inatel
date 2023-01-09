package com.inatel.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inatel.model.StockQuote;
import com.inatel.repository.StockQuoteRepository;
import com.inatel.service.QuoteService;

@RestController
public class QuoteController {

    @Autowired
    QuoteService service;

    @Autowired
    StockQuoteRepository repository;

    @GetMapping("/quotes")
    public List<StockQuote> getQuote(@RequestParam Optional<String> stockId) {

        //TODO tratar nulo da tabela

        return stockId.isPresent() ? List.of(repository.findByStockId(stockId.get())) : repository.findAll();

    }

    @PostMapping("/quotes")
    public ResponseEntity<?> createQuote(@RequestBody StockQuote stockQuote) {
        try {
            return ResponseEntity.ok(service.save(stockQuote));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getLocalizedMessage());
        }

    }

}
