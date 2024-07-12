package com.platzi.market.persistence;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import com.platzi.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper mapper;

    /**
     * Obtiene todos los productos
     * @return Lista de productos
     */
    @Override
    public List<Product> getAll() {
        Iterable<Producto> productos =  productoCrudRepository.findAll();
        return Collections.singletonList(mapper.toProduct((Producto) productos));
    }

    @Override
    public Optional<List<Product>> getCategoryById(Integer categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarseProduct(Integer quantity) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProductById(Integer productId) {
        return productoCrudRepository.findById(productId).map(producto -> (Product) mapper.toProduct(producto));
    }

    @Override
    public Optional<Producto> saveProducto(Producto producto) {
        return Optional.empty();
    }


    public Optional<Product> saveProducto(Product product) {
        Producto producto = mapper.toProducto(product);
        return Optional.ofNullable(mapper.toProduct(productoCrudRepository.save(producto)));
    }

    @Override
    public void deleteProductById(Integer productId) {

    }

}
