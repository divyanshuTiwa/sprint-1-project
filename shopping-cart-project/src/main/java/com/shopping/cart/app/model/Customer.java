package com.shopping.cart.app.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_number")
	private long customerNumber;
	
	@Column(name="customer_name",nullable =false,length=20)
	private String customerName;
	
	@Column(name="contact_last_name",nullable =false,length=20)
	private String contactLastName;
	
	@Column(name="contact_first_name",nullable =false,length=20)
	private String contactFirstName;
	
	@Column(name="phone")
	private BigInteger phone;
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="postal_code")
	private int postalCode;
	
	@Column(name="country")
	private String country;
	
	@Column(name="sales_rep_employee_number")
	private int salesRepEmployeeNumber;
	
	@Column(name="credit_limit")
	private double creditLimit;
	
	
	@OneToMany()
	@JoinColumn(name="order_number_customer_number")
	private List<Order> order =new ArrayList<Order>();
	
	@OneToOne(cascade= CascadeType.ALL,mappedBy="customers")
	private Payment payment;
	
	@ManyToOne()
	@JoinColumn(name="employee_number_customer_number")
	private Employee employee;
	
	
	
	
	public Customer() {
		super();
		
	}




	public Customer(long customerNumber, String customerName, String contactLastName, String contactFirstName,
			BigInteger phone, String addressLine1, String addressLine2, String city, String state, int postalCode,
			String country, int salesRepEmployeeNumber, double creditLimit, List<Order> order, Payment payment,
			Employee employee) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
		this.creditLimit = creditLimit;
		this.order = order;
		this.payment = payment;
		this.employee = employee;
	}




	public long getCustomerNumber() {
		return customerNumber;
	}




	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}




	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public String getContactLastName() {
		return contactLastName;
	}




	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}




	public String getContactFirstName() {
		return contactFirstName;
	}




	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}




	public BigInteger getPhone() {
		return phone;
	}




	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}




	public String getAddressLine1() {
		return addressLine1;
	}




	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}




	public String getAddressLine2() {
		return addressLine2;
	}




	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public int getPostalCode() {
		return postalCode;
	}




	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public int getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}




	public void setSalesRepEmployeeNumber(int salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}




	public double getCreditLimit() {
		return creditLimit;
	}




	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}




	public List<Order> getOrder() {
		return order;
	}




	public void setOrder(List<Order> order) {
		this.order = order;
	}




	public Payment getPayment() {
		return payment;
	}




	public void setPayment(Payment payment) {
		this.payment = payment;
	}




	public Employee getEmployee() {
		return employee;
	}




	public void setEmployee(Employee employee) {
		this.employee = employee;
	}




	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", contactLastName="
				+ contactLastName + ", contactFirstName=" + contactFirstName + ", phone=" + phone + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state
				+ ", postalCode=" + postalCode + ", country=" + country + ", salesRepEmployeeNumber="
				+ salesRepEmployeeNumber + ", creditLimit=" + creditLimit + ", order=" + order + ", payment=" + payment
				+ ", employee=" + employee + "]";
	}
	
	



	

}
