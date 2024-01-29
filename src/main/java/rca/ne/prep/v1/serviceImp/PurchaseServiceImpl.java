package rca.ne.prep.v1.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.Purchase;
import rca.ne.prep.v1.repositories.PurchaseRepository;
import rca.ne.prep.v1.services.PurchaseService;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase createPurchase(Purchase purchase) {
        return (Purchase) purchaseRepository.save(purchase);
    }
    @Override
    public List<Purchase> getAllPurchases(){
        return purchaseRepository.findAll();
    }
    @Override
    public Purchase getPurchaseDetails(Long purchaseId){
        return (Purchase) purchaseRepository.getById(purchaseId);
    }
}
