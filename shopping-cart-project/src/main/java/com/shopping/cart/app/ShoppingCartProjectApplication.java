package com.shopping.cart.app;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.shopping.cart.app.controller.ProductLineController;
import com.shopping.cart.app.model.ProductLine;





@SpringBootApplication
public class ShoppingCartProjectApplication implements CommandLineRunner {
	
	@Autowired
	private ProductLineController productLineController;
	/*
	@Autowired
	private AddValueController addValueController;*/
	
	

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("********________ProductLineData________*********");
		
		addProductLine(createProductLine());
	}
	
		private void addProductLine(List<ProductLine> productLines)  {
			
			for(ProductLine productLine: productLines) {
				
			}
		}
		private List<ProductLine> createProductLine(){
		//Creating productline objects
		ProductLine pl001 =new ProductLine("This is Pen","Html description", "img.jpeg",null);
		ProductLine pl002 =new ProductLine("This is book",null, "img2",null);
		ProductLine pl003 =new ProductLine("This is mobile",null, "img3",null);
	

		
		List<ProductLine> productLine = new ArrayList<ProductLine>();
		productLine.add(pl001);
		productLine.add(pl002);
		productLine.add(pl003);
		return productLine;
		
		
	
	}
		
		
		
		
	}


