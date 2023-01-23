package com.learning.multipledatabase.entity.db2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    private int id;

    private String name;

    private double price;
}
