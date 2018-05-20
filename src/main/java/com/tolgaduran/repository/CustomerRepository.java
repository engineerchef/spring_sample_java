package com.tolgaduran.repository;

import java.util.List;

import com.tolgaduran.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}