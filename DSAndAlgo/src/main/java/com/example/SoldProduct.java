package com.example;

import java.math.BigDecimal;
import java.util.Objects;


public class SoldProduct {
    String name;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    BigDecimal price;
    String currency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoldProduct that = (SoldProduct) o;
        return Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, currency);
    }
}
