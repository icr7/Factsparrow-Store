package com.factsparrow.ecommerce.service;

import com.factsparrow.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProductDetail();
    Product getProductDetail(int id);

    List<Product>getProductBySellerId(int userId);
    void saveProductDetail(Product product);
    void updateProductDetail(Product product);
    void deleteProduct(int id);

}
