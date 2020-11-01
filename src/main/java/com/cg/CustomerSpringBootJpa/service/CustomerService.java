package com.cg.CustomerSpringBootJpa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerSpringBootJpa.entites.Customer;
import com.cg.CustomerSpringBootJpa.repsoitory.ICustomerRepository;
@Transactional
@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private ICustomerRepository repo;
	@Override
	public Customer add(Customer customer) {
		return repo.add(customer);
	}

	@Override
	public Customer update(Customer customer) {
		
		return repo.update(customer);
	}

	

	@Override
	public Customer delete(Long id) {
		Customer customer=repo.findById(id);
		return repo.delete(customer);
	}
	@Override
	public Customer byId(Long id)
	{
		Customer customer=repo.findById(id);
		return repo.showCustomer(customer);
	}
	

}
