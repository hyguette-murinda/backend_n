package rca.ne.prep.v1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.ne.prep.v1.models.Cart;
import rca.ne.prep.v1.services.CartService;

import java.util.List;

@RestController
@RequestMapping("api/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    @PostMapping
    public ResponseEntity<Cart> addCart(@RequestBody Cart cart){
        Cart cart1 = cartService.addCart(cart);
        return new ResponseEntity<>(cart1, HttpStatus.CREATED);
    }
    @GetMapping("/{cartId}")
    public void removeCartWithId(@PathVariable Long cartId){
        cartService.removeCartWithId(cartId);
    }
    @GetMapping("/cart-items")
    public ResponseEntity<List<Cart>> cartItems(){
        List<Cart> cartItems = cartService.cartItems();
        return new ResponseEntity<>(cartItems, HttpStatus.OK);
    }
    @DeleteMapping
    public void removeAllCart(){
        cartService.removeAllCart();
    }
}
