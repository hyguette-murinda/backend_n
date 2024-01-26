package rca.ne.prep.v1.services;

import rca.ne.prep.v1.models.Purchase;

public interface PurchaseService {
    Purchase createPurchase(Long userId);
}
