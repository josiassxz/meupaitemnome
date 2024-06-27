package com.go.def.br.eventoscoleta.main.repository;

import com.go.def.br.eventoscoleta.main.entity.MeuPaiTemNome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MeuPaiTemNomeRepository extends JpaRepository<MeuPaiTemNome, Long>, JpaSpecificationExecutor<MeuPaiTemNome> {



}
