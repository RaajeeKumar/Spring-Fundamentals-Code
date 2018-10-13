package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {
	
	
	//@Autowired
	private CustomerRepository customerRepository;

	// Setter Based Injection
	public CustomerServiceImpl()
	{
		
	}
	
	//Constructor Based Injection
	/*public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("we are using Constructor based injection");
		this.customerRepository=customerRepository;		
	}*/
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	//setter Injection
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using Setter based injection");
		this.customerRepository = customerRepository;
	}

}
