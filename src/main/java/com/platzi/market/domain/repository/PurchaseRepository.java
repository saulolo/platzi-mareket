package com.platzi.market.domain.repository;

import com.platzi.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository{


    List<Purchase> getAll();

    Optional<List<Purchase>> getByclient(String clientId);

    Purchase savePurchase(Purchase purchase);

    void deletePurshaseById(Integer purchaseId);
}
