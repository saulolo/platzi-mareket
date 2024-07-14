package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<Product> getProductById(Integer productId);

    Optional<List<Product>> getCategoryById(Integer categoryId);

    Optional<List<Product>> getScarseProduct(Integer cantidad);

    Optional<Product> saveProducto(Product product);

    void deleteProductById(Integer productId);

}
