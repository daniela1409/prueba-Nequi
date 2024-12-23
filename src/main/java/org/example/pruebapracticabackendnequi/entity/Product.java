package org.example.pruebapracticabackendnequi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("product")
public class Product {

    @Id
    private Long id;
    private String name;
    private int stock;
    private Long branchOfficeId;
}
