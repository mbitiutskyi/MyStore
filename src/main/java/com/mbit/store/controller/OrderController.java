package com.mbit.store.controller;

import com.mbit.store.model.Cart;
import com.mbit.store.model.Customer;
import com.mbit.store.model.CustomerOrder;
import com.mbit.store.service.CartService;
import com.mbit.store.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mbitiutskyi.
 */

@Controller
public class OrderController {

    private CartService cartService;
    private CustomerOrderService customerOrderService;

    @Autowired
    public OrderController(CartService cartService, CustomerOrderService customerOrderService) {
        this.cartService = cartService;
        this.customerOrderService = customerOrderService;
    }

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
        CustomerOrder customerOrder = new CustomerOrder();
        Cart cart = cartService.getCartById(cartId);
        customerOrder.setCart(cart);

        Customer customer = cart.getCustomer();
        customerOrder.setCustomer(customer);
        customerOrder.setBillingAddress(customer.getBillingAddress());
        customerOrder.setShippingAddress(customer.getShippingAddress());

        customerOrderService.addCustomerOrder(customerOrder);

        return "redirect:/checkout?cartId=" + cartId;
    }
}
