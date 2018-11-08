package com.example.demo.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.viewmodel.Customer;
@Repository
public interface CustomerMongoRepository extends MongoRepository<Customer, String>{
	
	List<Customer> findAll();
	Customer save(Customer customer);
	void delete(Customer customer);
	Customer findById(int id);
	
}