package com.sample.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.spring.model.Customer;
import com.sample.spring.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository  customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	//to set the constructor dependency
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.sample.spring.service.CustomerService#findCustomers()
	 */
	@Override
	public List<Customer> findCustomers(){
		return customerRepository.findData();
	}

	// annotation using the setter dependencies
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
}
