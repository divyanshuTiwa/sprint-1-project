package com.shopping.cart.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.cart.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	@Query("Select from Product where productName = ?1 and buyPrice = ?2")
	List<Product> findAllByProductNameAndBuyPrice(String productName, double buyPrice);
	
	@Query("select p from Product p where p.buyPrice < ?1")
	List<Product> findByPriceLessThan(double buyPrice);
	
	@Query("select p from Product p where p.buyPrice > ?1")
	List<Product> findByPriceGreaterThan(double buyPrice);                  
	
	@Query("SELECT p FROM Product p WHERE p.productName LIKE ?1")
	List<Product> findByNameStartingWith(String prefix);

	List<Product> findAllOrderByBuyPrice();
		
	
	
	

}
