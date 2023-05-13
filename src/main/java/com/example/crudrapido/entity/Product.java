package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_product")
public class Product {
    @Column(name = "Id Producto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;


    @Column(name = "Nombre del producto",nullable = false)
    private String productName;

    @Column(name = "Tipo de producto",nullable = false)
    private String productType;

    @Column(name = "Codigo de producto",unique = true,nullable = false)
    private String productCode;

    @Column(name = "Stock de producto",nullable = false)
    private String stock;




}
