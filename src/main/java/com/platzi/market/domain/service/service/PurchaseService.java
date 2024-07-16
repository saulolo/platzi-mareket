package com.platzi.market.domain.service.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;


    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByCliente(String purchaseId) {
        return purchaseRepository.getByclient(purchaseId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.savePurchase(purchase);
    }

    public Boolean delete(String purchaseId) {
        return getByCliente(purchaseId).map(purchase -> {
            purchaseRepository.deletePurshaseById(Integer.valueOf(purchaseId));
            return true;
        }).orElse(false);
    }
}
