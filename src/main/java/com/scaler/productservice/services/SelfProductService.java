package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;
import com.scaler.productservice.repositories.ProductRepostory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelfProductService implements ProductService{
    private ProductRepostory productRepostory;

    public SelfProductService(ProductRepostory productRepostory) {
        this.productRepostory = productRepostory;
    }

    @Override
    public Product getSingleProduct(long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(long productId, Product product) {
        return null;
    }
}
