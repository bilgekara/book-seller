package com.bilgeli.bookseller.service;

import com.bilgeli.bookseller.model.PurchaseHistory;
import com.bilgeli.bookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
