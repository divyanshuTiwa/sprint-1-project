package com.shopping.cart.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="productlines")
public class ProductLine {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="product_line")
	private long productLine;
	
	@Column(name="text_description")
	private String textDescription;
	
	@Column(name="html_description")
	private String htmlDescription;
	
	@Column(name="image")
	private String image;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();

	public ProductLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductLine(long productLine, String textDescription, String htmlDescription, String image,
			List<Product> products) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
		this.products = products;
	}
	
	public ProductLine( String textDescription, String htmlDescription, String image,
			List<Product> products) {
		super();
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
		this.products = products;
	}

	public long getProductLine() {
		return productLine;
	}

	public void setProductLine(long productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductLine [productLine=" + productLine + ", textDescription=" + textDescription + ", htmlDescription="
				+ htmlDescription + ", image=" + image + ", products=" + products + "]";
	}
	
	
	
	
	

}
