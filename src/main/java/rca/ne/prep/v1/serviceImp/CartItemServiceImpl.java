package rca.ne.prep.v1.serviceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.CartItem;
import rca.ne.prep.v1.repositories.CartItemRepository;
import rca.ne.prep.v1.services.CartItemService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService {
    private final CartItemRepository cartItemRepository;

    @Override
    public CartItem addItemToCart(CartItem cartItem){
        return cartItemRepository.save(cartItem);
    }
    @Override
    public void removeItemToCartById(Long cartItemId){
        cartItemRepository.deleteById(cartItemId);

    }
    @Override
    public Optional<CartItem> findCartItemById(Long cartItemId){
        return cartItemRepository.findById(cartItemId);
    }
    @Override
    public List<CartItem> listAllItems(){
        return cartItemRepository.findAll();
    }
    @Override
    public  void removeAllItems(){
        cartItemRepository.deleteAll();
    }
}
