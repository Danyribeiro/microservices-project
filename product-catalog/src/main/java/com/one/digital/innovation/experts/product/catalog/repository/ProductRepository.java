package com.one.digital.innovation.experts.product.catalog.repository;

import com.one.digital.innovation.experts.product.catalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Iterable<Product> findByName(String name);
}
