package com.shopping.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.shopping.cart.app.model.ProductLine;


public interface ProductLineService {
	
	public List<ProductLine> findAll();

	public MessageResponse save(ProductLine productLine);

	public Optional<ProductLine> getById(long id);

	public List<ProductLine> sortedByDescription(ProductLine productLine);

	public List<ProductLine> paging();

	public Iterable<ProductLine> sorting(ProductLine productLine);

	ProductLine update(ProductLine productLine) ;

	
	

}
