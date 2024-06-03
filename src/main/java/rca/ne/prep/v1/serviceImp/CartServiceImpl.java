package rca.ne.prep.v1.serviceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.dto.requests.CreateCartDto;
import rca.ne.prep.v1.models.Cart;
import rca.ne.prep.v1.repositories.CartRepository;
import rca.ne.prep.v1.services.CartService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    @Override
    public Cart addCart(CreateCartDto cart){
        Cart cart1 = new Cart();
        cart1.setUser(cart.getUser());
        cart1.setCartItems(cart.getCartItems());
        return cartRepository.save(cart1);
    }
    @Override
    public void removeCartWithId(Long cartId){
        cartRepository.deleteById(cartId);
    }
    @Override
    public void removeAllCart(){
        cartRepository.deleteAll();
    }
    @Override
    public List<Cart> cartItems(){
        return cartRepository.findAll();
    }
}
