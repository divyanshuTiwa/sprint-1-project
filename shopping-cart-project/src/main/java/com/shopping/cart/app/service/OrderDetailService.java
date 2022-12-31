package com.shopping.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.shopping.cart.app.model.OrderDetail;


public interface OrderDetailService {
  
  public List<OrderDetail> findAll();

	public MessageResponse save(OrderDetail orderDetails);

	public Optional<OrderDetail> getById(long id);

	public List<OrderDetail> findGreaterthanEqualByPrice(double priceEach);

	public List<OrderDetail> paging();

	public Iterable<OrderDetail> sorting(OrderDetail orderDetails);

	OrderDetail update(OrderDetail orderDetails) ;


}
