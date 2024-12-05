package com.example.crudjpa.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Passaporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroPassaporte;

    @OneToOne(cascade = CascadeType.ALL) // Cascata: alterações em Person serão refletidas no Passaporte
    //@JoinColumn(name = "passport_id", referencedColumnName = "id") // Nome da coluna que referencia a chave estrangeira
    private Passaporte passport;
}

