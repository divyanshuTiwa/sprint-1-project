package com.shopping.cart.app.service;

public interface CustomerService{
  
  Optional<Customer> findById(long id);
	
	Customer save(Customer entity);
	
	void delete (long id);
	 
	List <Customer> findAll();
	
	List <Customer> findByContactFirstNameAndContactLastName(String firstName, String lastName);
	
	List <Customer> findByCityAndState(String city, String state);
	
	public List<Customer> paging();

	public Iterable<Customer> sorting(Customer customerdetails);
	
	List <Customer> findByPhoneNumber(String phone);
	
	List <Customer> findAllCustomerOrderByCreditLimit();
	
	List<Customer>findByCreditLimitLessThan(double creditLimit);
	
	List<Customer> findByCreditLimitGreaterThan(double creditLimit);
	

}
