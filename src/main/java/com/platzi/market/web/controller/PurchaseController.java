package com.platzi.market.web.controller;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.service.PurchaseService;
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

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;


    @GetMapping("/all")
    @Operation(summary = "Obtiene todas las compras", description = "Recuperar todas las compras en el sistema")
    @ResponseStatus(HttpStatus.OK)
    public List<Purchase> getAll() {
        return purchaseService.getAll();
    }

    @GetMapping("/{purchaseId}")
    @Operation(summary = "Obtiene las compras por Id.", description = "Recuperar las compras por Id.")
    public ResponseEntity<List<Purchase>> getPurchaseById(@PathVariable String purchaseId) {
        return purchaseService.getByCliente(purchaseId)
                .map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    @Operation(summary = "Crea las compras", description = "Crea las compras en el sistema.")
    public ResponseEntity<Purchase> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{purchaseId}")
    @Operation(summary = "Elimina las compras por Id", description = "Elimina las compras por Id en el sistema.")
    public ResponseEntity deletePurchaseId(@PathVariable String purchaseId) {
        if (purchaseService.delete(purchaseId)) {
            return new ResponseEntity<>(HttpStatus.OK) ;
        } else {
            return new ResponseEntity<>("No existe el recurso.",HttpStatus.NOT_FOUND) ;
        }
    }
}
