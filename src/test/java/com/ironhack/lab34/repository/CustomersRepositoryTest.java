package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Customers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomersRepositoryTest {
    Customers customers;

    @Autowired
    private CustomersRepository customersRepository;

    @BeforeEach
    void setUp() {
        customers = new Customers("Pepe", "Gold", 224534);
        customersRepository.save(customers);
    }

    @AfterEach
    void tearDown() {
        customersRepository.deleteAll();
    }

    @Test
    public void findAll_CustomersExist_Customers() {
        List<Customers> customersList = customersRepository.findAll();
        assertEquals(1, customersList.size());
    }

    @Test
    public void findCustomersByCustomerName_ValidCustomerName_RightCustomers() {
        Customers customers = customersRepository.findCustomersByCustomerName("Pepe");
        assertEquals("Pepe", customers.getCustomerName());
    }

    @Test
    public void findCustomersByCustomerStatus_ValidStatus_RightCustomers() {
        List<Customers> customersList = customersRepository.findCustomersByCustomerStatus("Gold");
        assertEquals(1, customersList.size());
    }
}

