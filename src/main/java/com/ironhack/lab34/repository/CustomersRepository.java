package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    public Customers findCustomersByCustomerName (String customerName);
    public List<Customers> findCustomersByCustomerStatus (String customerStatus);
}
