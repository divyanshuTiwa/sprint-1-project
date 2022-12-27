package com.shopping.cart.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_description",nullable=false,length=255)
	private String productDescription;
	
	@Column(name="quantity_in_stock")
	private Long quantityInStock;
	
	@Column(name="buyprice")
	private double buyPrice;
	
	@Column(name="msrp")
	private double MSRP;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="orderDetail_productCode")
	private OrderDetail orderDetail;
	
	@ManyToOne
	@JoinColumn(name="productline_productlines")
	private ProductLine productLine;

	public Product() {
		super();
		
	}

	public Product(String productDescription, Long quantityInStock, double buyPrice, double mSRP,
			OrderDetail orderDetail, ProductLine productLine) {
		super();
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		MSRP = mSRP;
		this.orderDetail = orderDetail;
		this.productLine = productLine;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Long getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Long quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMSRP() {
		return MSRP;
	}

	public void setMSRP(double mSRP) {
		MSRP = mSRP;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public ProductLine getProductLine() {
		return productLine;
	}

	public void setProductLine(ProductLine productLine) {
		this.productLine = productLine;
	}

	@Override
	public String toString() {
		return "Product [productDescription=" + productDescription + ", quantityInStock=" + quantityInStock
				+ ", buyPrice=" + buyPrice + ", MSRP=" + MSRP + ", orderDetail=" + orderDetail + ", productLine="
				+ productLine + "]";
	}
	
	
	
	

}
