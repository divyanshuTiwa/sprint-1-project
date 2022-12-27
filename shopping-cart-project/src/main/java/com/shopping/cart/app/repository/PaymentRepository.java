package com.shopping.cart.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.cart.app.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{
	
	@Query("Select P from Payment P where p.customer = ?1")
	List<Payment> findByCustomerNumber(long customerNumber);
	
	@Query("Select P from Payment P where p.amount < ?1")
	List<Payment> findByAmountLessThan(double amount);
	
	@Query("Select P from Payment P where p.amount > ?1")
	List<Payment> findByAmountGreaterThan(double amount);

	List<Payment> findAllPaymentByAmount();
	

}
