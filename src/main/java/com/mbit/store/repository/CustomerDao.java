package com.mbit.store.repository;

import com.mbit.store.model.Customer;

import java.util.List;

/**
 * Created by mbitiutskyi.
 */

public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}
