package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
		
	//Uncomment for constructor injection & autowiring by constructor
	/*public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Constructor Based Injection");
		this.customerRepository = customerRepository;
	}*/
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	// Uncomment it for setter injection, auto wiring by name and type
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter Based Injection");
		this.customerRepository = customerRepository;
	}

}
