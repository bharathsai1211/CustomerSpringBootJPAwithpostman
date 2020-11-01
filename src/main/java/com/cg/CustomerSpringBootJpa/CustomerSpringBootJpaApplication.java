package com.cg.CustomerSpringBootJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@SpringBootApplication
public class CustomerSpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSpringBootJpaApplication.class, args);
	}

}
