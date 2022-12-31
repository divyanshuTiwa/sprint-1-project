package com.shopping.cart.app.serviceimpl;

import org.springframework.stereotype.Service;

import com.shopping.cart.app.repository.OfficeRepository;
import com.shopping.cart.app.service.OfficeService;

@Service
public class OfficeServiceImpl implements OfficeService{
	
	private OfficeRepository officeRepository;
	
	@Override
	public List<Office> findAll() {
		return null;
	}

	@Override
	public MessageResponse save(Office office) {
		return null;
	}

	@Override
	public Optional<Office> getById(long id) {
		return Optional.empty();
	}

	@Override
	public List<Office> sortedByState(Office officedetails) {
		return null;
	}

	@Override
	public List<Office> getByCity(String city) {
		return null;
	}

	@Override
	public List<Office> paging() {
		return null;
	}

	@Override
	public Iterable<Office> sorting(Office officedetails) {
		return null;
	}

	@Override
	public Office update(Office office) {
		return null;
	}

	@Override
	public MessageResponse deleteById(long id) {
		return null;
	}


}
