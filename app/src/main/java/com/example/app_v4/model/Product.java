package com.example.app_v4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
public class Product {

    private int id;
    private String name;
    private String description;

    private int productResource;

    private Long price;

    public Product(int id, String name, String description, int productResource, Long price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.productResource = productResource;
        this.price  =price;
    }
}
