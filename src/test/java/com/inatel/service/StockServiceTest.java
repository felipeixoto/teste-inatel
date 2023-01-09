package com.inatel.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
public class StockServiceTest {

    @Autowired
    private StockService service;

    @Test
    public void isStockValidoTest() {
        
        boolean a = service.isStockValido("petr4");

        assertEquals(true, a);

    }
    
}
