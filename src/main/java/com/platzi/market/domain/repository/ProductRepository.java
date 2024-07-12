package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<List<Product>> getCategoryById(Integer categoryId);

    Optional<List<Product>> getScarseProduct(Integer cantidad);

    Optional<Product> getProductById(Integer productId);

    Optional<Producto> saveProducto(Producto producto);

    void deleteProductById(Integer productId);

}
