package com.globalside.codingchallenge.rbac.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class ProductDbo {

    @Id
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "price")
    String price;

    @Column(name = "category")
    String category;

    @Column(name = "brand")
    String brand;

    @Column(name = "color")
    String color;

}
