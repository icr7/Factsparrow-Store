package com.factsparrow.ecommerce.controller;

import com.factsparrow.ecommerce.model.Product;
import com.factsparrow.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productServiceImpl;

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return productServiceImpl.getAllProductDetail();
    }

    @GetMapping("/get/{id}")
    public Product get(@PathVariable("id") int id){
        return productServiceImpl.getProductDetail(id);
    }

    @GetMapping("/getBySeller/{id}")
    public List<Product> getBySeller(@PathVariable("id") int id){
        return productServiceImpl.getProductBySellerId(id);
    }

    @PostMapping("/saveProduct")
    public void saveProduct(@RequestBody Product product){
        productServiceImpl.saveProductDetail(product);
    }

}
