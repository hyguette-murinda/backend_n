package rca.ne.prep.v1.services;

import rca.ne.prep.v1.models.CartItem;

import java.util.List;
import java.util.Optional;

public interface CartItemService {
    CartItem addItemToCart(CartItem cartItem);
    void removeItemToCartById(Long cartItemId);
    Optional<CartItem> findCartItemById(Long cartItemId);
    void removeAllItems();
    List<CartItem> listAllItems();
}
