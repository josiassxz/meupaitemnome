package com.go.def.br.eventoscoleta.main.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class MeuPaiTemNome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int atendimentos;
    private int recPatComDna;
    private int recPatSemDna;
    private int recPatSocioAfetivaComMulti;
    private int recPatSocioAfetivaSemMulti;
    private int recMatSocoComMulti;
    private int recMatSocoSemMulti;
    private int recMatPostMortem;
    private int recPatPostMortem;
    private int dnaAgendados;
    private int dnaRealizados;
    private int dnaPositivos;
    private int pedidosHml;
    private int constaRegistroGenitor;
    private int naoConstaRegistroGenitor;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    @JsonIgnore
    private Usuario usuario;
}
