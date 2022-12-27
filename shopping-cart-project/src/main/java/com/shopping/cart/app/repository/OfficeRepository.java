package com.shopping.cart.app.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shopping.cart.app.model.Office;


public interface OfficeRepository extends JpaRepository<Office,Long>{
	
	@Query("Select O from Office O where o.city = ?1 and o.state = ?2")
	List<Office> findByCityAndState(String city, String state);
	
	@Query("Select O from Office o where o.phone= ?1")
	List<Office> findByPhone(String phone);
	
	@Query("Select * from Office order by city asc")
	List<Office> findAllOfficeOrderByCity();
	
	@Query("Select O from Office O where o.country= ?1")
	List<Office> findByCountry(String country);                  
	
	@Query("SELECT O FROM Office O WHERE o.city LIKE ?1")
	List<Office> findByCityStartingWith(String city);
	
	

	

	//void save(Office updateOffice);

}
