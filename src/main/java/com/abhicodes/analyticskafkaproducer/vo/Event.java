package com.abhicodes.analyticskafkaproducer.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Data
@JsonInclude(value=Include.NON_NULL)
public class Event {
	
	@NonNull
	private String eventType;
	@NonNull
	private String timestamp;
	@NonNull
	private String username;
	@NonNull
	private String browser;
	private EventDetails eventDetails;

}