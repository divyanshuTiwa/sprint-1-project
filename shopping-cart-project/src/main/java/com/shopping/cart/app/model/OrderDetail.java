package com.shopping.cart.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="orderdetails")
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_number")
	private long orderNumber;
	
	@Column(name="quantity_ordered")
	private int quantityOrdered;
	
	@Column(name="price_each")
	private double priceEach;
	
	@Column(name="order_line_number")
	private int orderLineNumber;
	
	@OneToOne
	@JoinColumn(name="product_code")
	private Product productcode;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="orderdetails")
	@JoinColumn(name="orderDetail_orderNumber")
	private Order order;

	public OrderDetail() {
		super();
		
	}

	public OrderDetail(long orderNumber, int quantityOrdered, double priceEach, int orderLineNumber,
			Product productcode, Order order) {
		super();
		this.orderNumber = orderNumber;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
		this.productcode = productcode;
		this.order = order;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public Product getProductcode() {
		return productcode;
	}

	public void setProductcode(Product productcode) {
		this.productcode = productcode;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderNumber=" + orderNumber + ", quantityOrdered=" + quantityOrdered + ", priceEach="
				+ priceEach + ", orderLineNumber=" + orderLineNumber + ", productcode=" + productcode + ", order="
				+ order + "]";
	}
	
	
	
	

}
