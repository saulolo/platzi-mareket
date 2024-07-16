package com.platzi.market.web.controller;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.service.service.PurchaseService;
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
    @ResponseStatus(HttpStatus.OK)
    public List<Purchase> getAll() {
        return purchaseService.getAll();
    }

    @GetMapping("/{purchaseId}")
    public ResponseEntity<List<Purchase>> getPurchaseById(@PathVariable String purchaseId) {
        return purchaseService.getByCliente(purchaseId)
                .map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<Purchase> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{purchaseId}")
    public ResponseEntity deletePurchaseId(@PathVariable String purchaseId) {
        if (purchaseService.delete(purchaseId)) {
            return new ResponseEntity<>(HttpStatus.OK) ;
        } else {
            return new ResponseEntity<>("No existe el recurso.",HttpStatus.NOT_FOUND) ;
        }
    }
}
