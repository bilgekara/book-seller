package com.bilgeli.bookseller.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase_history")
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "book_id", nullable = false)
    private Double bookId;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_history", nullable = false)
    private LocalDateTime purchaseTime;




}
