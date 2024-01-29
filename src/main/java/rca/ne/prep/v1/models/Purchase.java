package rca.ne.prep.v1.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long purchaseId;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "purchase")
    private List<PurchaseItem> purchaseItems = new ArrayList<>();
    private double totalPrice;

    public long getId() {
        return purchaseId;
    }

    public void setId(long id) {
        purchaseId = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PurchaseItem> getPurchaseItems() {
        return purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
