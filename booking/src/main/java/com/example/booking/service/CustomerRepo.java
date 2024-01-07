package com.example.booking.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booking.beans.Customer;



@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
	
	public Customer findByEmailAndPassword(String email, String password);

}
