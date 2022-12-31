package com.shopping.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.shopping.cart.app.model.Product;


public interface ProductService {
  
  public List<Product> findAll();

	public MessageResponse save(Product product);

	public Optional<Product> getById(long id);

	public List<Product> sortedByPrice(Product product);

	public List<Product> getByName(String productName);

	public List<Product> paging();

	public Iterable<Product> sorting(Product product);

	Product update(Product product) ;


}
