package com.platzi.market.web.controller;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.service.ProductService;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable Integer productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("/categoria/{cetegoryId}")
    public Optional<List<Product>> getByCategory(@PathVariable Integer cetegoryId) {
        return productService.getCategoryById(cetegoryId);
    }

    @PostMapping("/save")
    public Optional<Product> saveProducto(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/eliminar/{productId}")
    public Boolean deleteProductId(@PathVariable Integer productId) {
        return productService.delete(productId);
    }
}
