package rca.ne.prep.v1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.ne.prep.v1.models.CartItem;
import rca.ne.prep.v1.services.CartItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cartItems")
@RequiredArgsConstructor
public class CartItemController {
    private final CartItemService cartItemService;

    @PostMapping
    public ResponseEntity<CartItem> addItemToCart(@RequestBody CartItem cartItem){
        CartItem cartItem1 = cartItemService.addItemToCart(cartItem);
        return new ResponseEntity<>(cartItem1, HttpStatus.CREATED);
    }
    @GetMapping("/{cartItemId}")
    public ResponseEntity<Optional<CartItem>> findCartItemById(@PathVariable Long cartItemId){
        Optional<CartItem> cartItem = cartItemService.findCartItemById(cartItemId);
        return new ResponseEntity<>(cartItem, HttpStatus.OK);
    }
    @DeleteMapping("/{cartItemId}")
    public void removeItemToCartById(@PathVariable Long cartItemId){
        cartItemService.removeItemToCartById(cartItemId);
    }
    @DeleteMapping()
    public void removeAllItems(){
        cartItemService.removeAllItems();
    }
    @GetMapping()
    public ResponseEntity<List<CartItem>> listAllItems(){
        List<CartItem> cartItems = cartItemService.listAllItems();
        return new ResponseEntity<>(cartItems, HttpStatus.OK);
    }
}
