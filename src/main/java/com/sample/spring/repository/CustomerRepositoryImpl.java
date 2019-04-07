package com.sample.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sample.spring.model.Customer;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.sample.spring.repository.CustomerRepository#findData()
	 */
	@Override
	public List<Customer> findData() {
		List<Customer> customerList =new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("abc");
		customer.setLastName("xyz");
		customer.setId(1);
		customer.setCity("PUNE");
		customerList.add(customer);
		return customerList;
	}
}
