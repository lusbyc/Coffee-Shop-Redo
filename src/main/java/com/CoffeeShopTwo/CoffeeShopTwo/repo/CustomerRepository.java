package com.CoffeeShopTwo.CoffeeShopTwo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CoffeeShopTwo.CoffeeShopTwo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
