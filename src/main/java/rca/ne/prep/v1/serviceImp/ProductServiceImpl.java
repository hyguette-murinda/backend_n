package rca.ne.prep.v1.serviceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.Product;
import rca.ne.prep.v1.repositories.ProductRepository;
import rca.ne.prep.v1.services.ProductService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Product registerProduct(Product product){
        return (Product) productRepository.save(product);

    }
    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
