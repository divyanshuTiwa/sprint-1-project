package com.shopping.cart.app.serviceimpl;

import org.springframework.stereotype.Service;

import com.shopping.cart.app.repository.ProductRepository;
import com.shopping.cart.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return null;
	}

	@Override
	public MessageResponse save(Product product) {
		return null;
	}

	@Override
	public Optional<Product> getById(long id) {
		return Optional.empty();
	}

	@Override
	public List<Product> sortedByPrice(Product product) {
		return null;
	}

	@Override
	public List<Product> getByName(String productName) {
		return null;
	}

	@Override
	public List<Product> paging() {
		return null;
	}

	@Override
	public Iterable<Product> sorting(Product product) {
		return null;
	}

	@Override
	public Product update(Product product) {
		return null;
	}

	@Override
	public MessageResponse deleteById(long id) {
		return null;
	}
	
}
