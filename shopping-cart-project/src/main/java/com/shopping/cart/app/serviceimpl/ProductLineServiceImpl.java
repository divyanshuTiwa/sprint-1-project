package com.shopping.cart.app.serviceimpl;

import org.springframework.stereotype.Service;

import com.shopping.cart.app.repository.ProductLineRepository;
import com.shopping.cart.app.service.ProductLineService;

@Service
public class ProductLineServiceImpl implements ProductLineService{
	
	private ProductLineRepository productLineRepository;
	
	@Override
	public List<ProductLine> findAll() {
		return null;
	}

	@Override
	public MessageResponse save(ProductLine productLine) {
		return null;
	}

	@Override
	public Optional<ProductLine> getById(long id) {
		return Optional.empty();
	}

	@Override
	public List<ProductLine> sortedByDescription(ProductLine productLine) {
		return null;
	}

	@Override
	public List<ProductLine> paging() {

		return null;
	}

	@Override
	public Iterable<ProductLine> sorting(ProductLine productLine) {
		return null;
	}

	@Override
	public ProductLine update(ProductLine productLine) {
		return null;
	}

	@Override
	public MessageResponse deleteById(long id) {
		return null;
	}
	
	
}
