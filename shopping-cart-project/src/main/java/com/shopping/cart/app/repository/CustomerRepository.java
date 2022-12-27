package com.shopping.cart.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.cart.app.model.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	
	public Customer findBycustomerName(String customerName);
	
	@Query("Select C from Customer C where c.contactFirstName = ?1 and c.contactLastName = ?2, NamedQuery = true" )
	List<Customer> findByContactFirstNameAndContactLastName(String firstName, String lastName);
	
	@Query("Select C from Customer C where c.city = ?1 and c.state = ?2")
	List<Customer> findByCityAndState(String city, String state);
	
	@Query("Select C from Customer C where c.phone= ?1")
	List<Customer> findByPhoneNumber(String phone);
	
	@Query("Select C from Customer C where c.creditLimit < ?1")
	List<Customer> findByCreditLimitLessThan(double creditLimit);

	public List<Customer> findAllCustomerOrderByCreditLimit();


	
}



