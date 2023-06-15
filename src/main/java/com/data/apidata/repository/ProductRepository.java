package com.data.apidata.repository;

import com.data.apidata.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findBySupplierId(Long supplierId);
    List<Product> findByCategoriesId(Long categoryId);
}
