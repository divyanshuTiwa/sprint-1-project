package com.shopping.cart.app.model;

import java.util.ArrayList;
import java.util.Date;
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
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "order_number")
	private Long ordernumber;
	
	@Column(name = "order_date")
	private Date orderdate;
	
	@Column(name = "required_date")
	private Date requireddate;
	
	@Column(name="shipped_date")
	private Date shippedDate;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="comments")
	private String comments;
	
	@OneToMany(mappedBy="account",cascade=CascadeType.ALL)
	private List<OrderDetail>orderDetail=new ArrayList<>();

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long ordernumber, Date orderdate, Date requireddate, Date shippedDate, boolean status, String comments,
			List<OrderDetail> orderDetail) {
		super();
		this.ordernumber = ordernumber;
		this.orderdate = orderdate;
		this.requireddate = requireddate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.orderDetail = orderDetail;
	}
	
	public Order( Date orderdate, Date requireddate, Date shippedDate, boolean status, String comments,
			List<OrderDetail> orderDetail) {
		super();
		this.orderdate = orderdate;
		this.requireddate = requireddate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.orderDetail = orderDetail;
	}

	public Long getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Date getRequireddate() {
		return requireddate;
	}

	public void setRequireddate(Date requireddate) {
		this.requireddate = requireddate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "Order [ordernumber=" + ordernumber + ", orderdate=" + orderdate + ", requireddate=" + requireddate
				+ ", shippedDate=" + shippedDate + ", status=" + status + ", comments=" + comments + ", orderDetail="
				+ orderDetail + "]";
	}
	
	
	
	

}
