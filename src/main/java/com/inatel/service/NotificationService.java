package com.inatel.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.inatel.model.Stock;

@Service
public class NotificationService {

    String url = "http://localhost:8080/notification/";

    public ResponseEntity<String> notifica() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return response;

    }
}
