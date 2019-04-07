package com.sample.spring.service;

import java.util.List;

import com.sample.spring.model.Customer;

public interface CustomerService {

	List<Customer> findCustomers();

}