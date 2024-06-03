package rca.ne.prep.v1.dto.requests;

import lombok.Data;
import rca.ne.prep.v1.models.PurchaseItem;
import rca.ne.prep.v1.models.User;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreatePurchaseDto {
    private User user;
    private List<PurchaseItem> purchaseItems = new ArrayList<>();
    private double totalPrice;

}
