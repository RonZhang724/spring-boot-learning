package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    /*
    This repository works with Customer entities and Integer IDs
     */

    Customer findCustomerById(Integer id);

}