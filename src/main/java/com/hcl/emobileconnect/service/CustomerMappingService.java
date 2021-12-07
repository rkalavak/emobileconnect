package com.hcl.emobileconnect.service;

import org.springframework.stereotype.Service;

import com.hcl.emobileconnect.entity.CustomerEntity;
import com.hcl.emobileconnect.json.CustomerJson;

@Service
public class CustomerMappingService {
	
	public CustomerEntity createCustomerEntity(CustomerJson customerJson) {
		return CustomerEntity.builder().custName(customerJson.getCustName()).build();
	}
	
	public CustomerJson createCustomerJson(CustomerEntity customerEntity) {
		return CustomerJson.builder().custId(customerEntity.getCustId()).custName(customerEntity.getCustName()).build();
	}
}
