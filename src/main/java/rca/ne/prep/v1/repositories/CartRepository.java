package rca.ne.prep.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rca.ne.prep.v1.models.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
