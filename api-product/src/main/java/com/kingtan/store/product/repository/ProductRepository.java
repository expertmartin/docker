package com.kingtan.store.product.repository;


import com.kingtan.store.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //@Query("SELECT w FROM Product p WHERE p.name = ?#{authentication.name}")
    //List<Product> findAll();
}
