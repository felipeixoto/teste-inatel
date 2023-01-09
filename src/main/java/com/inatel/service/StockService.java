package com.inatel.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.inatel.model.Stock;

@Service
public class StockService {

    String url = "http://localhost:8080/stocks/";

    public boolean isStockValido(String stockId) {

        RestTemplate restTemplate = new RestTemplate();

        try {
            ResponseEntity<Stock> response = restTemplate.getForEntity(url + stockId, Stock.class);
            return response.getStatusCode().is2xxSuccessful();
            
        } catch (Exception e) {
            return false;
        }

        //TODO melhorar tratameto de exceao
    }
}
