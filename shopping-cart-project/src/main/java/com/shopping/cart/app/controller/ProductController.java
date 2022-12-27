package com.shopping.cart.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.app.exception.ProductNotFoundException;
import com.shopping.cart.app.model.Product;
import com.shopping.cart.app.repository.ProductRepository;



@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
	@GetMapping("/getall")
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	@GetMapping("/{productName}/{buyPrice}")
	public List<Product> getAllProductByProductNameAndBuyPrice(@PathVariable String productName,@PathVariable double buyPrice){
		return productRepository.findAllByProductNameAndBuyPrice(productName, buyPrice);
	}
	
	//find products by ByPrice decending order
	@GetMapping("/buyprice")
	public List<Product> findProductOrderByBuyPrice(){	
		return productRepository.findAllOrderByBuyPrice();
	}
	
	@GetMapping("/priceless/{price}")
	public List<Product> findByPriceLessThan(@PathVariable double price){	
		return productRepository.findByPriceLessThan(price);
	}
	
	@GetMapping("/pricegreater/{price}")
	public List<Product> findByPriceGreaterThan(@PathVariable double price){	
		return productRepository.findByPriceGreaterThan(price);
	}
	
	@GetMapping("/namestartwith/{prefix}")
	public List<Product> findByNameStartingWith(@PathVariable String prefix){	
		return productRepository.findByNameStartingWith(prefix);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable  long id) throws ProductNotFoundException {
		Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not exist with id: " + id));
        return ResponseEntity.ok(product);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id,@RequestBody Product product) throws ProductNotFoundException {
		Product updateProduct = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not exist with id: " + id));
		
		updateProduct.setProductLine(product.getProductLine());
		updateProduct.setProductLine(product.getProductLine());
		updateProduct.setProductLine(product.getProductLine());
		updateProduct.setProductDescription(product.getProductDescription());
		updateProduct.setQuantityInStock(product.getQuantityInStock());
		updateProduct.setBuyPrice(product.getBuyPrice());
		updateProduct.setMSRP(product.getMSRP());        

        productRepository.save(updateProduct);

        return ResponseEntity.ok(updateProduct);
    }

	@DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long id) throws ProductNotFoundException{

		Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not exist with id: " + id));

        productRepository.delete(product);

        return new ResponseEntity<>(HttpStatus.OK);

    }
}


