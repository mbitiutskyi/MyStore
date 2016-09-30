package com.mbit.store.repository;

import com.mbit.store.model.Product;

import java.util.List;

/**
 * Created by mbitiutskyi.
 */

public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
