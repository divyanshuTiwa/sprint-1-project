package com.shopping.cart.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.cart.app.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{
	
	@Query("select o from Order o where o.customer = ?1")
	List<Order> findByCustomerNumber(long customerNumber);
	
	@Query("Select o from Order o where o.status= ?1")
	List<Order> findByStatus(int status);
	
	@Query("Select * from Order order by orderDate desc")
	List<Order> findAllOrderByOrderDate();

	<Order> List<Order> findByCommentsContains(String likePattern);
	
//	@Query("Select O from Order O where o.comments LIKE CONCAT('%',:comments,'%')")
	//List<Order> findByCommentsContains(("comments") String likePattern);

	
	
}


