package com.mbit.store.controller.admin;

import com.mbit.store.model.Customer;
import com.mbit.store.model.Product;
import com.mbit.store.service.CustomerService;
import com.mbit.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by mbitiutskyi
 */

@Controller
@RequestMapping("/admin")
public class AdminHome {


    private ProductService productService;
    private CustomerService customerService;

    @Autowired
    public AdminHome(ProductService productService, CustomerService customerService) {
        this.productService = productService;
        this.customerService = customerService;
    }

    @RequestMapping
    public String adminPage() {
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model) {
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);
        return "productInventory";
    }

    @RequestMapping("/customer")
    public String customerManagement(Model model) {
        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customerList", customerList);
        return "customerManagement";
    }
}
