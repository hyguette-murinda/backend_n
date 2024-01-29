package rca.ne.prep.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rca.ne.prep.v1.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {

}
