package rca.ne.prep.v1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.ne.prep.v1.dto.requests.CreatePurchaseDto;
import rca.ne.prep.v1.models.Purchase;
import rca.ne.prep.v1.services.PurchaseService;

import java.util.List;

@RestController
@RequestMapping("/api/purchase")
@RequiredArgsConstructor
public class PurchaseController {
    private final PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<Purchase> createPurchase(@RequestBody CreatePurchaseDto purchase){
        Purchase purchase1 = purchaseService.createPurchase(purchase);
        return new ResponseEntity<>(purchase1, HttpStatus.CREATED);
    }
    @GetMapping("/{purchaseId}")
    public ResponseEntity<Purchase> getPurchaseDetails(@PathVariable Long purchaseId){
        Purchase purchase = purchaseService.getPurchaseDetails(purchaseId);
        return new ResponseEntity<>(purchase, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Purchase>> getAllPurchases(){
        List<Purchase> purchases = purchaseService.getAllPurchases();
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }
}
