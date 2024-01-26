package rca.ne.prep.v1.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import rca.ne.prep.v1.models.Purchase;
import rca.ne.prep.v1.services.CartService;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private CartService cartService;

    @Override
    public Purchase createPurchase(Long userId) {
        // Implementation to create a purchase from the user's cart
    }
}
