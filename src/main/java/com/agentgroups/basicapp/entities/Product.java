package com.agentgroups.basicapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {

    @Id
    private Integer prodId;

    private String prodName;

    private int price;


    public Product() {

    }
}
