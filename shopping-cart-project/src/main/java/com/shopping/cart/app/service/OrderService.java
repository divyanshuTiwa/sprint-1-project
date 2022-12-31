package com.shopping.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.shopping.cart.app.model.Order;

public interface OrderService{
  
  public List<Order> findAll();

	public MessageResponse save(Order order);

	public Optional<Order> getById(long id);

	public List<Order> getByStatus( boolean status);

	public List<Order> paging();

	public Iterable<Order> sorting(Order order);

	Order update(Order order) ;


}
