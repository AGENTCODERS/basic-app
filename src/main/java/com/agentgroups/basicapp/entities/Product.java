package com.agentgroups.basicapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private Integer prodId;

    private String prodName;

    private int price;


}
