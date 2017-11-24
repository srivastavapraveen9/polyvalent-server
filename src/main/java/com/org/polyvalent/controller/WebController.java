package com.org.polyvalent.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.polyvalent.domain.Customer;
import com.org.polyvalent.repository.CustomerRepository;

@RestController
@RequestMapping(value="/api")
public class WebController {

	@Autowired
	CustomerRepository repository;
	
	private Map<Integer, Customer> customers = new HashMap<Integer, Customer>(){

		{
	        put(1, new Customer(1, "Praveen", "Taylor"));
	        put(2, new Customer(2, "Peter", "Smith"));
	        put(3, new Customer(3, "Lauren", "Taylor"));
	    }
	};
	
	@GetMapping(value="/customerList",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAll(){
		List<Customer> results = customers.entrySet().stream()
									.map(entry ->entry.getValue())
									.collect(Collectors.toList());
		return results;
	}
}
