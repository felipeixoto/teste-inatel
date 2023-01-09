package com.inatel.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StockQuote {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	@JsonProperty("id")
	private UUID id;

	@Column(name = "stockId", updatable = false, unique = true, nullable = false)
	@JsonProperty("stockId")
	private String stockId;

	public StockQuote() {
	}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

}
