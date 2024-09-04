package com.example.shop.dto;

import lombok.Data;

@Data
public class CartItemDtO {
    private Long id;
    private Long productId;
    private int quantity;
    private Double price;
    private String productName;
}
