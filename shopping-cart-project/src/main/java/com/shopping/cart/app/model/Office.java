package com.shopping.cart.app.model;

import java.math.BigInteger;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="offices")
public class Office {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="office_code")
	private long officeCode;
	
	@Column(name="city")
	private String city;
	
	@Column(name="phone")
	private BigInteger phone;
	
	@Column(name="address_Line1")
	private String addressLine1;
	
	@Column(name="address_Line2")
	private String addressLine2;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="postal_Code")
	private int postalCode;
	
	@Column(name="territory")
	private String territory;
	
	@OneToMany
	@JoinColumn(name="employee_Number")
	private Employee employee;

	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Office(long officeCode, String city, BigInteger phone, String addressLine1, String addressLine2,
			String state, String country, int postalCode, String territory, Employee employee) {
		super();
		this.officeCode = officeCode;
		this.city = city;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
		this.employee = employee;
	}

	public long getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(long officeCode) {
		this.officeCode = officeCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Office [officeCode=" + officeCode + ", city=" + city + ", phone=" + phone + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", state=" + state + ", country=" + country
				+ ", postalCode=" + postalCode + ", territory=" + territory + ", employee=" + employee + "]";
	}


	

	
}
