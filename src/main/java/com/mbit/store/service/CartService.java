package com.mbit.store.service;

import com.mbit.store.model.Cart;

/**
 * Created by mbitiutskyi.
 */

public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
