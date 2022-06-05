package com.factsparrow.ecommerce.dao;

import com.factsparrow.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
   public List<Product> findAll();

   public Product findByProductId(Integer productId);
    @Query(value = "from Product p where p.user.userId = :sellerId")
    public List<Product> findAllBySellerId(@Param("sellerId") Integer sellerId);
}

