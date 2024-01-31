package rca.ne.prep.v1.services;

import rca.ne.prep.v1.models.PurchaseItem;

import java.util.List;
import java.util.Optional;

public interface PurchaseItemService {
    PurchaseItem addPurchaseItem(PurchaseItem purchaseItem);
    void removePurchaseItemById(Long purchaseItemId);
    Optional<PurchaseItem> getPurchaseItemById(Long purchaseItemId);
    List<PurchaseItem> getAllPurchaseItems();
    PurchaseItem updatePurchaseQuantityItemById(Long purchaseItemId, int quantity);
}
