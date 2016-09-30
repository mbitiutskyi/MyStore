package com.mbit.store.controller;

import com.mbit.store.model.BillingAddress;
import com.mbit.store.model.Customer;
import com.mbit.store.model.ShippingAddress;
import com.mbit.store.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by mbitiutskyi.
 */

@Controller
public class RegisterController {

    private CustomerService customerService;

    @Autowired
    public RegisterController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/register")
    public String registerCustomer(Model model) {

        Customer customer = new Customer();
        BillingAddress billingAddress = new BillingAddress();
        ShippingAddress shippingAddress = new ShippingAddress();
        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);

        model.addAttribute("customer", customer);

        return "registerCustomer";

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerCustomerPost(@Valid @ModelAttribute("customer") Customer customer, BindingResult result,
                                       Model model) {

        if (result.hasErrors()) {
            return "registerCustomer";
        }

        List<Customer> customerList = customerService.getAllCustomers();

        for (Customer existingCustomer : customerList) {
            if (customer.getCustomerEmail().equals(existingCustomer.getCustomerEmail())) {
                model.addAttribute("emailMsg", "Email already exists");
                return "registerCustomer";
            }
            if (customer.getUsername().equals(existingCustomer.getUsername())) {
                model.addAttribute("usernameMsg", "Username already exists");
                return "registerCustomer";
            }
        }

        customer.setEnabled(true);
        customerService.addCustomer(customer);

        return "registerCustomerSuccess";

    }

}
