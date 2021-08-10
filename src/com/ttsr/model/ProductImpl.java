package com.ttsr.model;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductImpl implements Product{

    private Long id;

    private String name;

    private BigDecimal price;

    public ProductImpl(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
