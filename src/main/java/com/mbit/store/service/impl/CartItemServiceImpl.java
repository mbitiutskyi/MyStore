package com.mbit.store.service.impl;

import com.mbit.store.repository.CartItemDao;
import com.mbit.store.model.Cart;
import com.mbit.store.model.CartItem;
import com.mbit.store.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mbitiutskyi
 */

@Service
public class CartItemServiceImpl implements CartItemService {

    private CartItemDao cartItemDao;

    @Autowired
    public CartItemServiceImpl(CartItemDao cartItemDao) {
        this.cartItemDao = cartItemDao;
    }

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart) {
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(int productId) {
        return cartItemDao.getCartItemByProductId(productId);
    }
}
