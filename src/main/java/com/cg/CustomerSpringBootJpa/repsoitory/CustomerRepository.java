package com.cg.CustomerSpringBootJpa.repsoitory;

import static com.cg.CustomerSpringBootJpa.constants.Constants.FindAllQuery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.CustomerSpringBootJpa.entites.Customer;
import com.cg.CustomerSpringBootJpa.exceptions.CustomerNotFoundException;

@Repository
public class CustomerRepository implements ICustomerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer delete(Customer customer) {
		entityManager.remove(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		boolean check = checkById(customer);
		if (!check) {
			throw new CustomerNotFoundException("Customer with customer id is not found with id: " + customer.getId());
		}
		customer = entityManager.merge(customer);
		return customer;
	}

	public boolean checkById(Customer customer) {
		return entityManager.find(Customer.class, customer.getId()) != null;
	}

	@Override
	public Customer findById(Long Id) {
		Customer customer = entityManager.find(Customer.class, Id);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer not found with id: " + Id);
		}
		return customer;
	}

	@Override
	public Customer showCustomer(Customer customer) {
		customer = entityManager.find(Customer.class, customer.getId());
		return customer;
	}

	@Override
	public List<Customer> findAll() {
		String query = FindAllQuery;
		TypedQuery<Customer> customer = entityManager.createQuery(query, Customer.class);
		List<Customer> cus = customer.getResultList();
		return cus;
	}

}
