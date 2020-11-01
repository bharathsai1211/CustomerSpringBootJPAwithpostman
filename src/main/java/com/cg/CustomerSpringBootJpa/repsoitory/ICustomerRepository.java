package com.cg.CustomerSpringBootJpa.repsoitory;

import com.cg.CustomerSpringBootJpa.entites.Customer;

public interface ICustomerRepository  {
	Customer add(Customer customer);
	Customer update(Customer customer);
	Customer delete(Customer customer);
	Customer findById(Long Id);
	Customer showCustomer(Customer customer);

}
