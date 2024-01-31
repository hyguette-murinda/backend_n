package rca.ne.prep.v1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.ne.prep.v1.models.PurchaseItem;
import rca.ne.prep.v1.services.PurchaseItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/purchaseItems")
@RequiredArgsConstructor
public class PurchaseItemController {
    private final PurchaseItemService purchaseItemService;

    @PostMapping
    public ResponseEntity<PurchaseItem> addPurchaseItem(@RequestBody PurchaseItem purchaseItem){
        PurchaseItem purchaseItem1 = purchaseItemService.addPurchaseItem(purchaseItem);
        return new ResponseEntity<>(purchaseItem1, HttpStatus.CREATED);
    }
    @DeleteMapping("/{purchaseItemId}")
    public void removePurchaseItemById(@PathVariable Long purchaseItemId){
        purchaseItemService.removePurchaseItemById(purchaseItemId);
    }
    @GetMapping("/{purchaseItemId}")
    public ResponseEntity<Optional>  getPurchaseItemById(@PathVariable Long purchaseItemId){
        Optional<PurchaseItem> purchaseItem = purchaseItemService.getPurchaseItemById(purchaseItemId);
        return new ResponseEntity<>(purchaseItem, HttpStatus.OK) ;
    }
    @GetMapping("/purchase-items")
    public ResponseEntity<List<PurchaseItem>>  getAllPurchaseItems(){
        List<PurchaseItem> purchaseItemList = purchaseItemService.getAllPurchaseItems();
        return new ResponseEntity<>(purchaseItemList, HttpStatus.OK);
    }
    @PutMapping("/{purchaseItemId}")
    public ResponseEntity<PurchaseItem>  updatePurchaseQuantityItemById(@PathVariable Long purchaseItemId, int quantity){
        PurchaseItem purchaseItem = purchaseItemService.updatePurchaseQuantityItemById(purchaseItemId,quantity);
        return new ResponseEntity<>(purchaseItem, HttpStatus.OK);
    }
}
