package com.cg.CustomerSpringBootJpa.service;

import com.cg.CustomerSpringBootJpa.entites.Customer;

public interface ICustomerService {
	Customer add(Customer customer);
	
	Customer delete(Long id);
	Customer byId(Long id);
	Customer update(Customer customer);

}
