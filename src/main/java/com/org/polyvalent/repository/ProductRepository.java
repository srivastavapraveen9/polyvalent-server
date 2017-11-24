package com.org.polyvalent.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.org.polyvalent.domain.Product;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
