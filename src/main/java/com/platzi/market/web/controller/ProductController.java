package com.platzi.market.web.controller;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/all")
    @Operation(summary = "Obtiene todos los productos.", description = "Recupera todos los productos del sistema.")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{productId}")
    @Operation(summary = "Obtiene productos por Id.", description = "Recupera productos del sistema por Id.")
    public ResponseEntity<Product> getProductById(@PathVariable Integer productId) {
        return productService.getProductById(productId)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/categoria/{cetegoryId}")
    @Operation(summary = "Obtiene los productos filtrados por categoria", description = "Recupera todos los productos" +
            " por categoria del sistema.")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable Integer cetegoryId) {
        return productService.getCategoryById(cetegoryId)
                .map(products -> new ResponseEntity<>(products, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @Operation(summary = "Crea productos.", description = "Crea productos en el sistema.")
    public ResponseEntity<Optional<Product>> saveProducto(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{productId}")
    @Operation(summary = "Elimina productos por Id.", description = "Elimina productos en el sistema por Id.")
    public ResponseEntity deleteProductId(@PathVariable Integer productId) {
        if (productService.delete(productId)) {
            return new ResponseEntity<>(HttpStatus.OK) ;
        } else {
            return new ResponseEntity<>("No existe el recurso.",HttpStatus.NOT_FOUND) ;
        }
    }
}
