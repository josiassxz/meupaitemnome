package com.go.def.br.eventoscoleta.main.entity;


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

    private int nAtendimentos;
    private int nRecPatComDna;
    private int nRecPatSemDna;
    private int nRecPatSocioAfetivaComMulti;
    private int nRecPatSocioAfetivaSemMulti;
    private int nRecMatSocoComMulti;
    private int nRecMatSocoSemMulti;
    private int nRecMatPostMortem;
    private int nRecPatPostMortem;
    private int nDnaAgendados;
    private int nDnaRealizados;
    private int nDnaPositivos;
    private int nPedidosHml;
    private int nConstaRegistroGenitor;
    private int nNaoConstaRegistroGenitor;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

}
