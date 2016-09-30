package com.mbit.store.repository.impl;

import com.mbit.store.repository.CartDao;
import com.mbit.store.model.Cart;
import com.mbit.store.service.CustomerOrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by mbitiutskyi.
 */

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    private SessionFactory sessionFactory;
    private CustomerOrderService customerOrderService;

    @Autowired
    public CartDaoImpl(SessionFactory sessionFactory, CustomerOrderService customerOrderService) {
        this.sessionFactory = sessionFactory;
        this.customerOrderService = customerOrderService;
    }

    public Cart getCartById(int cartId) {
        Session session = sessionFactory.getCurrentSession();
        return (Cart) session.get(Cart.class, cartId);
    }

    public void update(Cart cart) {
        int cartId = cart.getCartId();
        double grandTotal = customerOrderService.getCustomerOrderGrandTotal(cartId);
        cart.setGrandTotal(grandTotal);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);
    }

    public Cart validate(int cartId) throws IOException {
        Cart cart = getCartById(cartId);
        if (cart == null || cart.getCartItems().size() == 0) {
            throw new IOException(String.valueOf(cartId));
        }
        update(cart);
        return cart;
    }
}
