package com.example;

import java.math.BigDecimal;

public class SimpleSoldProduct {
    String name;
    BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public SimpleSoldProduct(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
