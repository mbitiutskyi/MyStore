package com.mbit.store.service;

import com.mbit.store.model.Cart;
import com.mbit.store.model.CartItem;

/**
 * Created by mbitiutskyi.
 */

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);
}
