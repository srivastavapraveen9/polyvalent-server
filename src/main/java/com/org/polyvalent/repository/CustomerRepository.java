package com.org.polyvalent.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.org.polyvalent.domain.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}