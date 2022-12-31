package com.shopping.cart.app.serviceimpl;

import org.springframework.stereotype.Service;

import com.shopping.cart.app.service.PaymentService;

@Service
public class PaymentServiceImpl implements  PaymentService{
  
  @Override
	public List<Payment> findAll() {
		return null;
	}

	@Override
	public MessageResponse save(Payment payment) {
		return null;
	}

	@Override
	public Optional<Payment> getById(long id) {
		return Optional.empty();
	}

	@Override
	public List<Payment> sortedByAmount(Payment payment) {
		return null;
	}

	@Override
	public List<Payment> paging() {
		return null;
	}

	@Override
	public Iterable<Payment> sorting(Payment payment) {
		return null;
	}

	@Override
	public Payment update(Payment payment) {
		return null;
	}

	@Override
	public MessageResponse deleteById(long id) {
		return null;
	}


}
