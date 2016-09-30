package com.mbit.store.repository;

import com.mbit.store.model.Cart;
import com.mbit.store.model.CartItem;

/**
 * Created by mbitiutskyi.
 */

public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
