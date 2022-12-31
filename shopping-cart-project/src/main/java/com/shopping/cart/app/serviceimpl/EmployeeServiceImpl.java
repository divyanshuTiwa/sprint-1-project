package com.shopping.cart.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.cart.app.repository.CustomerRepository;
import com.shopping.cart.app.repository.EmployeeRepository;
import com.shopping.cart.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		return null;
	}

	@Override
	public MessageResponse save(Employee employee) {
		return null;
	}

	@Override
	public Optional<Employee> getById(long id) {
		return Optional.empty();
	}

	@Override
	public List<Employee> sortedByEmail(Employee employeedetails) {
		return null;
	}

	@Override
	public List<Employee> getByName(String firstName) {
		return null;
	}

	@Override
	public List<Employee> paging() {
		return null;
	}

	@Override
	public Iterable<Employee> sorting(Employee employeedetails) {
		return null;
	}

	@Override
	public Employee update(Employee employee) {
		return null;
	}

	@Override
	public MessageResponse deleteById(long id) {
		
		return null;
	}
	
	
	
}
