package com.mbit.store.service;

import com.mbit.store.model.Product;

import java.util.List;

/**
 * Created by mbitiutskyi.
 */

public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
