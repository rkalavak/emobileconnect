package com.hcl.emobileconnect.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hcl.emobileconnect.dao.CustomerRepo;
import com.hcl.emobileconnect.json.CustomerJson;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepo customerRepo;
	private final CustomerMappingService customerMappingService;

	@Override
	public CustomerJson saveCustomer(CustomerJson customerJson) {
		return Optional.ofNullable(customerRepo.save(customerMappingService.createCustomerEntity(customerJson)))
				.map(customerMappingService::createCustomerJson).orElseThrow(() -> new RuntimeException(
						String.format("Unable to save customer % data", customerJson.getCustName())));
	}
}
