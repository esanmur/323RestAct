package com.gcu.restactivity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.restactivity.Entity.Product;
import com.gcu.restactivity.Repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository; 
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }
    
    public Product updateProduct(Long id, Product updatedProduct) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()){
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setUrgent(updatedProduct.getUrgent());
            product.setImportant(updatedProduct.getImportant());
            return productRepository.save(product);
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
