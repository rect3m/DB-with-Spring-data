package com.rect2m.controller;

import com.rect2m.entity.Product;
import com.rect2m.service.CategoryService;
import com.rect2m.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    // Впровадження залежностей через конструктор
    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    // Отримати всі продукти з пагінацією
    @GetMapping
    public String getAllProducts(Model model,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {
        Page<Product> productPage = productService.getPaginatedProducts(PageRequest.of(page, size));
        model.addAttribute("products", productPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", productPage.getTotalPages());
        return "products"; // Ім'я шаблону Thymeleaf
    }

    // Отримати продукти за категорією
    @GetMapping("/category/{id}")
    public String getProductsByCategory(@PathVariable("id") Long categoryId, Model model) {
        List<Product> products = productService.getProductsByCategory(categoryId);
        model.addAttribute("products", products);
        return "products";
    }

    // Фільтрація за ціновим діапазоном
    @GetMapping("/filter")
    public String filterProducts(@RequestParam(value = "minPrice", required = false, defaultValue = "0") Double minPrice,
            @RequestParam(value = "maxPrice", required = false, defaultValue = "1000000") Double maxPrice,
            Model model) {
        List<Product> products = productService.getProductsByPriceRange(minPrice, maxPrice);
        model.addAttribute("products", products);
        return "filterResults";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }

    // Пошук за назвою
    @GetMapping("/search")
    public String searchProducts(@RequestParam("query") String query, Model model) {
        List<Product> products = productService.searchProductsByName(query);
        model.addAttribute("products", products);
        return "searchResults"; // Повертаємо ім'я нового шаблону
    }
}