package com.shopping.cart.app.serviceimpl;

import org.springframework.stereotype.Service;

import com.shopping.cart.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
  
  @Override
	public List<Order> findAll() {
		return null;
	}

	@Override
	public MessageResponse save(Order order) {
		return null;
	}

	@Override
	public Optional<Order> getById(long id) {
		return Optional.empty();
	}

	@Override
	public List<Order> getByStatus(boolean status) {
		return null;
	}

	@Override
	public List<Order> paging() {
		return null;
	}

	@Override
	public Iterable<Order> sorting(Order order) {
		return null;
	}

	@Override
	public Order update(Order order) {
		return null;
	}

	@Override
	public MessageResponse deleteById(long id) {
		return null;
	}


}
