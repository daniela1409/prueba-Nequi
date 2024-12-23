package org.example.pruebapracticabackendnequi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("branch_office")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchOffice {
    @Id
    private Long id;
    private List<Product> products;
    private Long franchiseId;
}
