package fr.doranco.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.doranco.backend.models.Product;

@RestController
@RequestMapping("product")
public class ProductController {
    private static final Map<Long, Product> products = new HashMap<>();

    static {
        products.put(1L, new Product(1L, "Laptop", 1200.50));
        products.put(2L, new Product(2L, "Smartphone", 800.00));
        products.put(3L, new Product(3L, "Tablet", 450.99));
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return products.getOrDefault(id, null);
    }
}
