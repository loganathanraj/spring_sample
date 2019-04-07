package com.sample.spring.repository;

import java.util.List;

import com.sample.spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findData();

}