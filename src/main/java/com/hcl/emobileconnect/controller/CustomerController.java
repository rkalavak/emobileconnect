package com.hcl.emobileconnect.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.emobileconnect.json.CustomerJson;
import com.hcl.emobileconnect.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<CustomerJson> saveCustomer(@RequestBody CustomerJson customerJson) {
		return ResponseEntity.ok(customerService.saveCustomer(customerJson));
	}
}
