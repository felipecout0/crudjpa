package com.example.crudjpa.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.crudjpa.model.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDepartamento;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, orphanRemoval = true)
    // mappedBy: referência ao atributo 'department' na classe Employee
    // cascade: persistir ou excluir um departamento reflete nos funcionários associados
    private List<Funcionario> employees = new ArrayList<>();
}
