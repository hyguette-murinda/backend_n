package rca.ne.prep.v1.services;

import rca.ne.prep.v1.models.Product;

import java.util.Optional;

public interface ProductService {
    Product registerProduct(Product product);
    Optional getProductById(Long productId);
}
