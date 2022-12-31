package com.shopping.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.shopping.cart.app.model.Employee;


public interface EmployeeService {
  
  public List<Employee> findAll();

	public MessageResponse save(Employee employee);

	public Optional<Employee> getById(long id);

	public List<Employee> sortedByEmail(Employee employeedetails);

	public List<Employee> getByName(String firstName);

	public List<Employee> paging();

	public Iterable<Employee> sorting(Employee employeedetails);

	Employee update(Employee employee) ;


}
