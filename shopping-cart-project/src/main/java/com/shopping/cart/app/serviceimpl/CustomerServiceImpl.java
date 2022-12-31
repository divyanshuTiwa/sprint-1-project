package com.shopping.cart.app.serviceimpl;

import com.shopping.cart.app.repository.CustomerRepository;
import com.shopping.cart.app.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	@Override
	public Optional<Customer> findById(long id) {
		return Optional.empty();
	}


	@Override
	public Customer save(Customer entity) {
		return null;
	}


	@Override
	public void delete(long id) {
		
	}


	@Override
	public List<Customer> findAll() {
		return null;
	}


	@Override
	public List<Customer> findByContactFirstNameAndContactLastName(String firstName, String lastName) {
		return null;
	}


	@Override
	public List<Customer> findByCityAndState(String city, String state) {
		return null;
	}


	@Override
	public List<Customer> findByPhoneNumber(String phone) {
		return null;
	}


	@Override
	public List<Customer> findAllCustomerOrderByCreditLimit() {
		return null;
	}


	@Override
	public List<Customer> findByCreditLimitLessThan(double creditLimit) {
		return null;
	}


	@Override
	public List<Customer> findByCreditLimitGreaterThan(double creditLimit) {
		return null;
	}


	@Override
	public List<Customer> paging() {
		return null;
	}


	@Override
	public Iterable<Customer> sorting(Customer customerdetails) {
		return null;
	}


}
