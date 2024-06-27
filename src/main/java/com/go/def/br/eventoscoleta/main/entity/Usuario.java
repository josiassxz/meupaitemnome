package com.go.def.br.eventoscoleta.main.entity;

import com.go.def.br.eventoscoleta.main.enums.Uf;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Uf uf;

    private String senha;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MeuPaiTemNome> meuPaiTemNome;
}
