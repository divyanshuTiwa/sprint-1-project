package com.shopping.cart.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.cart.app.repository.OrderDetailRepository;
import com.shopping.cart.app.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public List<OrderDetail> findAll() {
		return null;
	}

	@Override
	public MessageResponse save(OrderDetail orderDetails) {
		return null;
	}

	@Override
	public Optional<OrderDetail> getById(long id) {
		return Optional.empty();
	}

	@Override
	public List<OrderDetail> findGreaterthanEqualByPrice(double priceEach) {
		return null;
	}

	@Override
	public List<OrderDetail> paging() {
		return null;
	}

	@Override
	public Iterable<OrderDetail> sorting(OrderDetail orderDetails) {
		return null;
	}

	@Override
	public OrderDetail update(OrderDetail orderDetails) {
		return null;
	}

	@Override
	public MessageResponse deleteById(long id) {
		return null;
	}


}
