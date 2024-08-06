package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;
import dtos.FakeStoreProductDto;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long productId);
    List<Product> getAllProducts();
    Product updateProduct(long productId, Product product);
}
