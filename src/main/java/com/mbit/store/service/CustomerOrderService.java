package com.mbit.store.service;

import com.mbit.store.model.CustomerOrder;

/**
 * Created by mbitiutskyi.
 */

public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
