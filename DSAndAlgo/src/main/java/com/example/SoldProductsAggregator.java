package com.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SoldProductsAggregator {

    private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {
        if(products == null){
            return new SoldProductsAggregate(new ArrayList<>(), BigDecimal.ZERO);
        }
      List<SimpleSoldProduct> simpleSoldProducts = products.filter(soldProduct ->
                      soldProduct.currency == null).map(product -> new
                SimpleSoldProduct(product.getName(), product.getPrice()))
              .collect(Collectors.toList());


        BigDecimal sum = new BigDecimal(0);
      for(SimpleSoldProduct simpleSoldProduct : simpleSoldProducts){
          sum.add(simpleSoldProduct.getPrice());
      }

        exchangeService.rate("EUR")
                .ifPresent((var) -> {
                    sum.multiply(var);
                });

      return new SoldProductsAggregate(simpleSoldProducts, sum);
    }
}
