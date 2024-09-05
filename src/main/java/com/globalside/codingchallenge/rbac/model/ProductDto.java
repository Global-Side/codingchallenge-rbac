package com.globalside.codingchallenge.rbac.model;

import lombok.Data;

@Data
public class ProductDto {
    String id;
    String name;
    String description;
    String price;
    String category;
    String brand;
    String color;
    String size;
}
