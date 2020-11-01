package com.cg.CustomerSpringBootJpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerSpringBootJpa.entites.Customer;
import com.cg.CustomerSpringBootJpa.repsoitory.ICustomerRepository;
import com.cg.CustomerSpringBootJpa.util.ValidationUtil;

@Transactional
@Service
public class CustomerService implements ICustomerService {
	public static final Logger log = LoggerFactory.getLogger(CustomerService.class);
	@Autowired
	private ICustomerRepository repo;

	@Override
	public Customer add(Customer customer) {
		ValidationUtil.checkArgumentNotNull(customer);
		ValidationUtil.checkName(customer.getName());
		return repo.add(customer);
	}

	@Override
	public Customer update(Customer customer) {
		ValidationUtil.checkArgumentNotNull(customer);
		ValidationUtil.checkName(customer.getName());
		return repo.update(customer);
	}

	@Override
	public Customer delete(Long id) {
		Customer customer = repo.findById(id);
		return repo.delete(customer);
	}

	@Override
	public Customer byId(Long id) {
		Customer customer = repo.findById(id);
		return repo.showCustomer(customer);
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customer = repo.findAll();
		return customer;
	}

}
