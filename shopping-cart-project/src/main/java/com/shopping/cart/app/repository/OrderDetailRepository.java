package com.shopping.cart.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shopping.cart.app.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long>{
	
	@Query("Select OD from OrderDetail OD where od.priceEach= ?1")
	List<OrderDetail> findByPriceEach(double priceEach);
	
	@Query("Select * from OrderDetail order by priceEach desc")
	List<OrderDetail> findAllOrderDetailOrderByPriceEach();
	
	@Query("Select OD from OrderDetail OD where od.quantityOrdered < ?1")
	List<OrderDetail> findByQuantityOrderedLessThan(int quantityOrdered);
	
	@Query("Select OD from OrderDetail OD where od.quantityOrdered > ?1")
	List<OrderDetail> findByQuantityOrderedGreaterThan(int quantityOrdered);

	List<OrderDetail> findByOrderLineNumber(int orderLineNumber);                  
	

}
