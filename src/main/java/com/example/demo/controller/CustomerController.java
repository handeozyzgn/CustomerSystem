package com.example.demo.controller;

import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.CustomerMongoRepository;
import com.example.demo.viewmodel.Customer;

//@CrossOrigin("*")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	CustomerMongoRepository  customerMongoRepository;
	static int x = 10;

	@GetMapping
    public List<Customer> listAllUsers() {
		System.out.print(customerMongoRepository.findAll().get(0));
		return customerMongoRepository.findAll();
    }
	@PostMapping
	public Customer createCustomer(@Valid @RequestBody Customer customer) {
		customer.setActive(true);
		Random rand = new Random();
		int  index = rand.nextInt(50000) + 1;
		x = x+ 1;
		customer.setId(index);
		return customerMongoRepository.save(customer);
	}
	
	@PutMapping(path = {"/{id}"})
	public Customer update(@PathVariable("id") int id, @RequestBody Customer customer){
		customer.setId(id);
	    return customerMongoRepository.save(customer);
	}
	@GetMapping(path = {"/{id}"})
	public Customer findById(@PathVariable("id") int id){
	     return customerMongoRepository.findById(id);
	}

	
    @DeleteMapping(path ={"/{id}"})
    public Customer delete(@PathVariable("id") int id) {
    	Customer customer = customerMongoRepository.findById(id);
        customerMongoRepository.delete(customer);
        return customer;
    }
}
