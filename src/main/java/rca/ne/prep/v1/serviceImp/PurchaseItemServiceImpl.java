package rca.ne.prep.v1.serviceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.PurchaseItem;
import rca.ne.prep.v1.repositories.PurchaseItemRepository;
import rca.ne.prep.v1.services.PurchaseItemService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PurchaseItemServiceImpl implements PurchaseItemService {
    private final PurchaseItemRepository purchaseItemRepository;
    @Override
    public PurchaseItem addPurchaseItem(PurchaseItem purchaseItem){
        return (PurchaseItem) purchaseItemRepository.save(purchaseItem);
    }
    @Override
    public void removePurchaseItemById(Long purchaseItemId){
         purchaseItemRepository.deleteById(purchaseItemId);
    }
    @Override
    public Optional getPurchaseItemById(Long purchaseItemId){
        return  purchaseItemRepository.findById(purchaseItemId);
    }
    @Override
    public List<PurchaseItem> getAllPurchaseItems(){
        return purchaseItemRepository.findAll();
    }
    @Override
    public PurchaseItem updatePurchaseQuantityItemById(Long purchaseItemId, int newQuantity){
        Optional<PurchaseItem> purchaseItem = purchaseItemRepository.findById(purchaseItemId);
        PurchaseItem purchaseItem1 = purchaseItem.get();
        purchaseItem1.setQuantity(newQuantity);
        return purchaseItem1;
    }


}
