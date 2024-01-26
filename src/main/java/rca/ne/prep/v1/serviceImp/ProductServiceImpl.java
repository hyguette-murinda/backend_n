package rca.ne.prep.v1.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.Product;
import rca.ne.prep.v1.repositories.ProductRepository;
import rca.ne.prep.v1.services.ProductService;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product registerProduct(Product product){
        return (Product) productRepository.save(product);

    }
    @Override
    public Optional getProductById(Long productId){
        return productRepository.findById(productId);

    }
}
