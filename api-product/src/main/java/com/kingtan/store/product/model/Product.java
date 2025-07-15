package com.kingtan.store.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
//
//    @Version
//    @Column(name = "VERSION")
//    private int version;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private Double price;
}
