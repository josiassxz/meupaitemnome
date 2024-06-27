package com.go.def.br.eventoscoleta.main.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.go.def.br.eventoscoleta.main.entity.MeuPaiTemNome;
import com.go.def.br.eventoscoleta.main.enums.Uf;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Uf uf;
    private String senha;


}
