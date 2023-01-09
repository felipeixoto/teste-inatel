package com.inatel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stock {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("description")
	private String description;
	
	public Stock() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
