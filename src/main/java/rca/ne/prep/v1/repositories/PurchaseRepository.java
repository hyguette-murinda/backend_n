package rca.ne.prep.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rca.ne.prep.v1.models.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}
