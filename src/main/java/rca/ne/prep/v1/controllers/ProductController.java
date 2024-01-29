package rca.ne.prep.v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.ne.prep.v1.models.Product;
import rca.ne.prep.v1.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    public ResponseEntity<Product> registerProduct(@RequestBody Product product){
        Product savedProduct = productService.registerProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
