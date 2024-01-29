package rca.ne.prep.v1.services;

import rca.ne.prep.v1.models.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase createPurchase(Purchase purchase);
    List<Purchase> getAllPurchases();
    Purchase getPurchaseDetails(Long purchaseId);
}
