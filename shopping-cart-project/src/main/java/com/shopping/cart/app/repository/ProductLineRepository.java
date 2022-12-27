package com.shopping.cart.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.cart.app.model.ProductLine;

@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine,Long> {
	
	@Query("Select * from ProductLine where textDescription = ?1 and htmlDescription = ?2")
	List<ProductLine> findAllByTextDescriptionAndHtmlDescription(String textDescription, String htmlDescription);
	
	@Query("SELECT Pl FROM ProductLine pl WHERE p.image LIKE ?1")
	List<ProductLine> findByImageLike(String image);
	
//	@Query("SELECT p FROM ProductLine p WHERE p.textDescription LIKE CONCAT('%',:pDesc,'%')")
//	List<ProductLine> findByTextDescriptionContains(@joe("jDesc") String likePattern);
	
	@Query("Select * from ProductLine where textDescription = ?1 or htmlDescription = ?2")
	List<ProductLine> findByTextDescriptionOrHtmlDescription(String textDescription, String htmlDescription);

	List<ProductLine> findByTextDescriptionContains(String name);
	

}
