package com.rect2m.service;

import com.rect2m.entity.Category;
import com.rect2m.repository.CategoryRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // Впровадження залежностей через конструктор
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Отримати всі категорії
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Зберегти категорію
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
}
