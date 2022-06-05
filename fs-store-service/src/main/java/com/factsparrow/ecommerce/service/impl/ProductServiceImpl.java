package com.factsparrow.ecommerce.service.impl;

import com.factsparrow.ecommerce.dao.ProductRepository;
import com.factsparrow.ecommerce.model.Product;
import com.factsparrow.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProductDetail() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductDetail(int id) {
        return this.productRepository.findByProductId(id);
    }

    @Override
    public List<Product> getProductBySellerId(int userId) {
        return this.productRepository.findAllBySellerId(userId);
    }

    @Override
    public void saveProductDetail(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProductDetail(Product product) {

    }

    @Override
    public void deleteProduct(int id) {

    }
}
