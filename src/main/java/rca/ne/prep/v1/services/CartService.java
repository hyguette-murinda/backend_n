package rca.ne.prep.v1.services;

import rca.ne.prep.v1.models.Cart;

import java.util.List;

public interface CartService {
    Cart addCart(Cart cart);
    void removeCartWithId(Long cartId);
    List<Cart> cartItems();

    void removeAllCart();
}
