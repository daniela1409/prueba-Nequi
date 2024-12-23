package org.example.pruebapracticabackendnequi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.UUID;

@Table("Franchise")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Franchise {
    @Id
    private UUID id;
    private String name;
}
