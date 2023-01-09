package com.inatel.listener;


import org.json.JSONObject;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AppStartupListener {

    public void onApplicationEvent(ContextRefreshedEvent event) {

        String url = "http://localhost:8080/notification/";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject json = new JSONObject();
        json.put("host", "localhost");
        json.put("port", "8081");
        HttpEntity<String> request = new HttpEntity<String>(json.toString(), headers);

/// NOTIFICA AO INICIAR
  

      
      restTemplate.postForObject(url, request, String.class);
      
    }
}
