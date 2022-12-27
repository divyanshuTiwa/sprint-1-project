package com.shopping.cart.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="payments")
public class Payment {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="customer_number")
	private int customerNumber;
	
	@Column(name="payment_Date")
	private Date paymentDate;
	
	@Column(name="amount")
	private int amount;
	
	@OneToOne
	@JoinColumn(name="customer_number_customer_number")
	private Customer customer ;
	

	public Payment() {
		super();
	}

	

	public Payment(int customerNumber, Date paymentDate, int amount, Customer customer) {
		super();
		this.customerNumber = customerNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.customer = customer;
	}



	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	@Override
	public String toString() {
		return "Payment [customerNumber=" + customerNumber + ", paymentDate=" + paymentDate + ", amount=" + amount
				+ ", customer=" + customer + "]";
	}

	
	
	

}
