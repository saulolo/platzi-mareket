package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    /**
     * Consulta los productos por el Id de categoria ordenados por el nombre de forma ascendente.
     * @param idCategoria - id de categiria.
     * @return  lista de productos con la información de la categoria.
     */
    List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);



    /**
     * Consulta los productos por la cantidad de stock y el estado.
     * @param cantidadStock - cantidad de stock.
     * @param estado - estado del producto.
     * @return lista de productos con la cantidad de stock menor a la solicitada y el estado del producto.
     */
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock, Boolean estado);
}
