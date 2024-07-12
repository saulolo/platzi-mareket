package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProductById(Integer productId) {
        return productRepository.getProductById(productId);
    }

    public Optional<List<Product>> getCategoryById(Integer categoryId) {
        return productRepository.getCategoryById(categoryId);
    }

    public Optional<Producto> save(Producto product) {
        return productRepository.saveProducto(product);
    }

    public Boolean delete(Integer productId) {
        return getProductById(productId).map(product -> {
            productRepository.deleteProductById(productId);
            return true;
        }).orElse(false);
    }
}
