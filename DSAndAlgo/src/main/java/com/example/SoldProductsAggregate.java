package com.example;

import java.math.BigDecimal;
import java.util.List;

public class SoldProductsAggregate {
    List<SimpleSoldProduct> products;
    BigDecimal total;

    public SoldProductsAggregate(List<SimpleSoldProduct> products, BigDecimal total) {
        this.products = products;
        this.total = total;
    }
}
