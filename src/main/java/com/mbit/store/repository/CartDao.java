package com.mbit.store.repository;

import com.mbit.store.model.Cart;

import java.io.IOException;

/**
 * Created by mbitiutskyi.
 */

public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
