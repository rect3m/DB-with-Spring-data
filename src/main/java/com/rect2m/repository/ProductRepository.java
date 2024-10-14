package com.rect2m.repository;

import com.rect2m.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Знайти продукти за категорією
    List<Product> findByCategoryId(Long categoryId);

    // Фільтрація за ціновим діапазоном
    List<Product> findByPriceBetween(double minPrice, double maxPrice);

    // Пошук за назвою
    List<Product> findByNameContainingIgnoreCase(String name);
}