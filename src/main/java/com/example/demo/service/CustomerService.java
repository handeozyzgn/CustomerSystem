package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.viewmodel.Customer;
import com.example.demo.repository.CustomerMongoRepository;

@Service
public class CustomerService {
	/*
	@Autowired
	CustomerMongoRepository  customerMongoRepository;
	
	public List<Customer> getAllCustomers(){
		return customerMongoRepository.findAll();
	}
	
	public Customer delete(int id) {
		Customer customer = findById(id);
	    if(customer != null){
	    	customerMongoRepository.delete(customer);
	    }
	    return customer;
	}
	
	public Customer findById(int id) {
	    return customerMongoRepository.findOne(id);
	}
	
	public Customer create(Customer customer) {
	    return customerMongoRepository.save(customer);
	}
	
    public Customer update(Customer customer) {
        return customerMongoRepository.save(customer);
    }*/
}
