package rca.ne.prep.v1.serviceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.Cart;
import rca.ne.prep.v1.repositories.CartRepository;
import rca.ne.prep.v1.services.CartService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    @Override
    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
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
