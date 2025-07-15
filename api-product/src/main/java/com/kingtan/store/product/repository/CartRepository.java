package com.kingtan.store.product.repository;

import com.kingtan.store.product.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartItem, Long> {
}