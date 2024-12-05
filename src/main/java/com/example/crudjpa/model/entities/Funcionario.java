package com.example.crudjpa.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeFuncionario;

    @ManyToOne
    //@JoinColumn(name = "departamento_id") // Define a coluna de chave estrangeira
    private Departamento departamento;
}
