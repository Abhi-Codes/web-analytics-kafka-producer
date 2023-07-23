package com.abhicodes.analyticskafkaproducer.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(value=Include.NON_NULL)
public class EventDetails {
	
	private String objectName;
	private String recordType;
	private String agreementStatus;
	private String searchCategory;
	private String searchKeyword;
	private String downloadType;
	private String templateId;
	private String fileName;
	private String agreementNumber;

}
