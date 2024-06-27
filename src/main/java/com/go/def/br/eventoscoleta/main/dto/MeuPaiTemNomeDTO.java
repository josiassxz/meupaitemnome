package com.go.def.br.eventoscoleta.main.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MeuPaiTemNomeDTO {
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
    private Long usuarioId;
}
