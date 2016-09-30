package com.mbit.store.service;

import com.mbit.store.model.Customer;

import java.util.List;

/**
 * Created by mbitiutskyi.
 */

public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);
}
